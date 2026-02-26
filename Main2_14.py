def main():
    n = int(input())

    max_value = -10**18
    min_value = int(input())

    for _ in range(n - 1):
        x = int(input())

        result = x - min_value

        if result > max_value:
            max_value = result

        if x < min_value:
            min_value = x

    print(max_value)


if __name__ == "__main__":
    main()