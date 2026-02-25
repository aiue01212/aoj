def main():
    n = int(input())
    a = list(map(int, input().split()))

    result = sum(a)
    a.sort()

    print(a[0], a[n - 1], result)


if __name__ == "__main__":
    main()