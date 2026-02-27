import sys

def partition(A, p, r):
    x = A[r]
    i = p - 1

    for j in range(p, r):
        if A[j] <= x:
            i += 1
            A[i], A[j] = A[j], A[i]

    A[i + 1], A[r] = A[r], A[i + 1]
    return i + 1


def main():
    input = sys.stdin.readline

    n = int(input())
    A = list(map(int, input().split()))

    q = partition(A, 0, n - 1)

    result = []
    for i in range(n):
        if i == q:
            result.append(f"[{A[i]}]")
        else:
            result.append(str(A[i]))

    print(" ".join(result))


if __name__ == "__main__":
    main()