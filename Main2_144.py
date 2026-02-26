import sys

def main():
    input = sys.stdin.readline

    T = input().rstrip()
    Q = int(input())

    results = []

    for _ in range(Q):
        P = input().rstrip()
        if P in T:
            results.append("1")
        else:
            results.append("0")

    print("\n".join(results))


if __name__ == "__main__":
    main()