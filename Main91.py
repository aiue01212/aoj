import sys

def main():
    W = input().lower() 

    count = 0

    for line in sys.stdin:
        for word in line.split():
            if word.lower() == W:
                count += 1

    print(count)


if __name__ == "__main__":
    main()