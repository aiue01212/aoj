import sys
sys.setrecursionlimit(10**7)

def build(preStart, preEnd, inStart, inEnd):
    if preStart > preEnd or inStart > inEnd:
        return

    root = preorder[preStart]

    rootIndex = -1
    for i in range(inStart, inEnd + 1):
        if inorder[i] == root:
            rootIndex = i
            break

    leftSize = rootIndex - inStart

    build(preStart + 1,
          preStart + leftSize,
          inStart,
          rootIndex - 1)

    build(preStart + leftSize + 1,
          preEnd,
          rootIndex + 1,
          inEnd)

    postorder.append(root)


def main():
    input = sys.stdin.readline

    n = int(input())

    global preorder, inorder, postorder
    preorder = list(map(int, input().split()))
    inorder = list(map(int, input().split()))
    postorder = []

    build(0, n - 1, 0, n - 1)

    print(" ".join(map(str, postorder)))


if __name__ == "__main__":
    main()