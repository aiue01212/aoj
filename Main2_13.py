def main():
    n = int(input())
    result = 0

    for _ in range(n):
        x = int(input())
        prime = True

        if x % 2 == 0:
            if x == 2:
                prime = True
            else:
                prime = False
        else:
            j = 3
            while j * j <= x:
                if x % j == 0:
                    prime = False
                    break
                j += 2

        if prime:
            result += 1

    print(result)


if __name__ == "__main__":
    main()