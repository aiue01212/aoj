def main():
    n = int(input())
    dictionary = set()

    for _ in range(n):
        command, string = input().split()

        if command == "insert":
            dictionary.add(string)
        elif command == "find":
            if string in dictionary:
                print("yes")
            else:
                print("no")


if __name__ == "__main__":
    main()