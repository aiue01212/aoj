import sys
sys.setrecursionlimit(10**7)

def setDepth(u, d):
    depth[u] = d

    if left[u] != -1:
        setDepth(left[u], d + 1)
    if right[u] != -1:
        setDepth(right[u], d + 1)


def setHeight(u):
    h1 = h2 = 0

    if left[u] != -1:
        h1 = setHeight(left[u]) + 1
    if right[u] != -1:
        h2 = setHeight(right[u]) + 1

    height[u] = max(h1, h2)
    return height[u]


def main():
    input = sys.stdin.readline

    n = int(input())

    global left, right, parent, depth, height
    left = [-1] * n
    right = [-1] * n
    parent = [-1] * n
    depth = [0] * n
    height = [0] * n

    for _ in range(n):
        id, l, r = map(int, input().split())
        left[id] = l
        right[id] = r

        if l != -1:
            parent[l] = id
        if r != -1:
            parent[r] = id

    root = -1
    for i in range(n):
        if parent[i] == -1:
            root = i
            break

    setDepth(root, 0)
    setHeight(root)

    for i in range(n):
        deg = 0
        if left[i] != -1:
            deg += 1
        if right[i] != -1:
            deg += 1

        sibling = -1
        if parent[i] != -1:
            if left[parent[i]] == i:
                sibling = right[parent[i]]
            else:
                sibling = left[parent[i]]

        if parent[i] == -1:
            node_type = "root"
        elif deg == 0:
            node_type = "leaf"
        else:
            node_type = "internal node"

        print(
            f"node {i}: parent = {parent[i]}, "
            f"sibling = {sibling}, "
            f"degree = {deg}, "
            f"depth = {depth[i]}, "
            f"height = {height[i]}, "
            f"{node_type}"
        )


if __name__ == "__main__":
    main()