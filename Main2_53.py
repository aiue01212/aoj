import math
import sys

sys.setrecursionlimit(10**6)

def koch(n, x1, y1, x2, y2):
    if n == 0:
        return

    sx = (2.0 * x1 + x2) / 3.0
    sy = (2.0 * y1 + y2) / 3.0

    tx = (x1 + 2.0 * x2) / 3.0
    ty = (y1 + 2.0 * y2) / 3.0

    ux = (sx + tx) / 2.0 - (ty - sy) * math.sqrt(3.0) / 2.0
    uy = (sy + ty) / 2.0 + (tx - sx) * math.sqrt(3.0) / 2.0

    koch(n - 1, x1, y1, sx, sy)
    print(f"{sx:.8f} {sy:.8f}")

    koch(n - 1, sx, sy, ux, uy)
    print(f"{ux:.8f} {uy:.8f}")

    koch(n - 1, ux, uy, tx, ty)
    print(f"{tx:.8f} {ty:.8f}")

    koch(n - 1, tx, ty, x2, y2)


def main():
    n = int(input())

    print("0.00000000 0.00000000")
    koch(n, 0.0, 0.0, 100.0, 0.0)
    print("100.00000000 0.00000000")


if __name__ == "__main__":
    main()