def main():
    H, W = map(int, input().split())
    field = [input().rstrip() for _ in range(H)]

    R, C = map(int, input().split())
    pattern = [input().rstrip() for _ in range(R)]

    for i in range(H - R + 1):
        for j in range(W - C + 1):
            match = True
            for r in range(R):
                if field[i + r][j:j + C] != pattern[r]:
                    match = False
                    break
            if match:
                print(i, j)


if __name__ == "__main__":
    main()