def main():
    n = int(input())

    ts = 0
    hs = 0

    for _ in range(n):
        t, h = input().split()

        if t > h:
            ts += 3
        elif t < h:
            hs += 3
        else:
            ts += 1
            hs += 1

    print(ts, hs)


if __name__ == "__main__":
    main()
