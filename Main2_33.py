import sys
from collections import deque

def main():
    input = sys.stdin.readline

    n = int(input())
    dq = deque()

    for _ in range(n):
        command = input().split()

        if command[0] == "insert":
            dq.appendleft(int(command[1]))

        elif command[0] == "delete":
            x = int(command[1])
            try:
                dq.remove(x)  
            except ValueError:
                pass  

        elif command[0] == "deleteFirst":
            if dq:
                dq.popleft()

        elif command[0] == "deleteLast":
            if dq:
                dq.pop()

    print(" ".join(map(str, dq)))


if __name__ == "__main__":
    main()