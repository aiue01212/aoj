def main():
    while True:
        H, W = map(int, input().split())

        if H == 0 and W == 0:
            break

        for i in range(H):
            for j in range(W):
                if (i + 1) % 2 == 1:
                    if (j + 1) % 2 == 1:
                        print("#", end="")
                    else:
                        print(".", end="")
                else:
                    if (j + 1) % 2 == 1:
                        print(".", end="")
                    else:
                        print("#", end="")
            print()

        print()


if __name__ == "__main__":
    main()