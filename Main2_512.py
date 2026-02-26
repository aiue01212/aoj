import sys

def main():
    input = sys.stdin.readline

    n = int(input())
    A = list(map(int, input().split()))

    q = int(input())
    M = list(map(int, input().split()))

    max_sum = sum(A)

    dp = [False] * (max_sum + 1)
    dp[0] = True

    for a in A:
        for s in range(max_sum, a - 1, -1):
            if dp[s - a]:
                dp[s] = True

    for m in M:
        if m <= max_sum and dp[m]:
            print("yes")
        else:
            print("no")

if __name__ == "__main__":
    main()