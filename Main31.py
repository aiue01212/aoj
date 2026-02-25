def main():
    for _ in range(10000):
        x, y = map(int, input().split())

        if x == 0 and y == 0:
            break

        if x <= y:
            print(x, y)
        else:
            print(y, x)


if __name__ == "__main__":
    main()