def main():
    n, m = map(int, input().split())

    A = [list(map(int, input().split())) for _ in range(n)]

    b = [int(input()) for _ in range(m)]

    for i in range(n):
        total = 0
        for j in range(m):
            total += A[i][j] * b[j]
        print(total)


if __name__ == "__main__":
    main()