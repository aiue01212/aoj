def main():
    while True:
        n, x = map(int, input().split())

        if n == 0 and x == 0:
            break

        result = 0

        for j in range(1, n + 1):
            for k in range(j + 1, n + 1):
                for l in range(k + 1, n + 1):
                    if j + k + l == x:
                        result += 1

        print(result)


if __name__ == "__main__":
    main()