import sys
sys.setrecursionlimit(10**7)

def can_make(A, index, target):
    if target == 0:
        return True
    if index == len(A):
        return False

    if can_make(A, index + 1, target - A[index]):
        return True

    return can_make(A, index + 1, target)


def main():
    input = sys.stdin.readline

    n = int(input())
    A = list(map(int, input().split()))

    q = int(input())
    M = list(map(int, input().split()))

    for m in M:
        if can_make(A, 0, m):
            print("yes")
        else:
            print("no")


if __name__ == "__main__":
    main()