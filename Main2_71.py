import sys
sys.setrecursionlimit(10**7)

def dfs(u, d):
    depth[u] = d
    for v in children[u]:
        dfs(v, d + 1)


def main():
    input = sys.stdin.readline

    n = int(input())

    global parent, depth, children
    parent = [-1] * n
    depth = [0] * n
    children = [[] for _ in range(n)]

    for _ in range(n):
        data = list(map(int, input().split()))
        node_id = data[0]
        k = data[1]
        for c in data[2:]:
            children[node_id].append(c)
            parent[c] = node_id

    root = -1
    for i in range(n):
        if parent[i] == -1:
            root = i
            break

    dfs(root, 0)

    for i in range(n):
        if parent[i] == -1:
            node_type = "root"
        elif len(children[i]) == 0:
            node_type = "leaf"
        else:
            node_type = "internal node"

        print(f"node {i}: parent = {parent[i]}, depth = {depth[i]}, "
              f"{node_type}, [{', '.join(map(str, children[i]))}]")

if __name__ == "__main__":
    main()