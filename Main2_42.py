import sys

def binary_search(S, key):
    left = 0
    right = len(S) - 1

    while left <= right:
        mid = (left + right) // 2

        if S[mid] == key:
            return True
        elif S[mid] < key:
            left = mid + 1
        else:
            right = mid - 1

    return False


def main():
    input = sys.stdin.readline

    n = int(input())
    S = list(map(int, input().split()))

    S.sort() 

    q = int(input())
    T = list(map(int, input().split()))

    count = 0
    for t in T:
        if binary_search(S, t):
            count += 1

    print(count)


if __name__ == "__main__":
    main()