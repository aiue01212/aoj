import sys

def main():
    n = int(sys.stdin.readline().strip())

    if n == 0 or n == 1:
        print(1)
        return

    a = 1
    b = 1

    for _ in range(2, n + 1):
        c = a + b
        a = b
        b = c

    print(b)

if __name__ == "__main__":
    main()