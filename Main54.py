def contains3(x):
    while x > 0:
        if x % 10 == 3:
            return True
        x //= 10
    return False


def main():
    n = int(input())

    for i in range(1, n + 1):
        if i % 3 == 0:
            print(" " + str(i), end="")
        elif i % 10 == 3:
            print(" " + str(i), end="")
        elif contains3(i):
            print(" " + str(i), end="")

    print() 


if __name__ == "__main__":
    main()