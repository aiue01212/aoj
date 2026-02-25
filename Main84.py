def main():
    input_str = input().strip()
    ansinput = input().strip()

    result = 0
    count = 0

    for i in range(len(input_str)):
        if input_str[i] == ansinput[0]:
            result += 1
            for j in range(1, len(ansinput)):
                k = i + j
                if k > len(input_str) - 1:
                    k = k - len(input_str)

                if input_str[k] != ansinput[j]:
                    count += 1
                    break

    if result == count:
        print("No")
    else:
        print("Yes")


if __name__ == "__main__":
    main()