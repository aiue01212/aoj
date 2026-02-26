import sys

def main():
    input = sys.stdin.readline

    H = int(input())
    A = [0] + list(map(int, input().split())) 

    for i in range(1, H + 1):
        output = f"node {i}: key = {A[i]}"

        if i != 1:
            output += f", parent key = {A[i // 2]}"

        left = 2 * i
        if left <= H:
            output += f", left key = {A[left]}"

        right = 2 * i + 1
        if right <= H:
            output += f", right key = {A[right]}"

        output += ","
        print(output)


if __name__ == "__main__":
    main()