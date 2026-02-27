import sys

def main():
    input = sys.stdin.readline

    n = int(input())
    A = [list(map(int, input().split())) for _ in range(n)]

    INF = 10**18

    used = [False] * n
    min_cost = [INF] * n
    min_cost[0] = 0

    result = 0

    for _ in range(n):
        v = -1

        for u in range(n):
            if not used[u] and (v == -1 or min_cost[u] < min_cost[v]):
                v = u

        used[v] = True
        result += min_cost[v]

        for u in range(n):
            if not used[u] and A[v][u] != -1:
                min_cost[u] = min(min_cost[u], A[v][u])

    print(result)


if __name__ == "__main__":
    main()