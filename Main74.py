def main():
    n, m, l = map(int, input().split())

    A = [list(map(int, input().split())) for _ in range(n)]

    B = [list(map(int, input().split())) for _ in range(m)]

    result = [[0] * l for _ in range(n)]

    for i in range(n):
        for j in range(l):
            for k in range(m):
                result[i][j] += A[i][k] * B[k][j]

    for i in range(n):
        print(*result[i])


if __name__ == "__main__":
    main()