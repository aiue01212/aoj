def bubble_sort(C, N):
    for i in range(N):
        for j in range(N - 1, i, -1):
            if C[j][1] < C[j - 1][1]:
                C[j], C[j - 1] = C[j - 1], C[j]


def selection_sort(C, N):
    for i in range(N):
        minj = i
        for j in range(i, N):
            if C[j][1] < C[minj][1]:
                minj = j
        C[i], C[minj] = C[minj], C[i]


def print_cards(C, N):
    print(" ".join(C))


def main():
    N = int(input())
    C = input().split()

    bubble = C[:]
    selection = C[:]

    bubble_sort(bubble, N)
    selection_sort(selection, N)

    print_cards(bubble, N)
    print("Stable")

    print_cards(selection, N)

    if bubble == selection:
        print("Stable")
    else:
        print("Not stable")


if __name__ == "__main__":
    main()