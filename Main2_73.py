import sys
sys.setrecursionlimit(10**7)

def preorder(u):
    if u == -1:
        return
    preorder_list.append(u)
    preorder(left[u])
    preorder(right[u])


def inorder(u):
    if u == -1:
        return
    inorder(left[u])
    inorder_list.append(u)
    inorder(right[u])


def postorder(u):
    if u == -1:
        return
    postorder(left[u])
    postorder(right[u])
    postorder_list.append(u)


def main():
    input = sys.stdin.readline

    n = int(input())

    global left, right
    left = [-1] * n
    right = [-1] * n
    parent = [-1] * n

    for _ in range(n):
        node_id, l, r = map(int, input().split())
        left[node_id] = l
        right[node_id] = r

        if l != -1:
            parent[l] = node_id
        if r != -1:
            parent[r] = node_id

    # root を探す
    root = -1
    for i in range(n):
        if parent[i] == -1:
            root = i
            break

    global preorder_list, inorder_list, postorder_list
    preorder_list = []
    inorder_list = []
    postorder_list = []

    preorder(root)
    inorder(root)
    postorder(root)

    print("Preorder")
    print(" " + " ".join(map(str, preorder_list)))

    print("Inorder")
    print(" " + " ".join(map(str, inorder_list)))

    print("Postorder")
    print(" " + " ".join(map(str, postorder_list)))


if __name__ == "__main__":
    main()