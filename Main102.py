import math

def main():
    x, y, si = map(float, input().split())

    rad = math.radians(si)

    S = x * y * math.sin(rad) / 2
    z = math.sqrt(x**2 + y**2 - 2 * x * y * math.cos(rad))
    L = x + y + z
    h = (2 * S) / x

    print(f"{S:.8f}")
    print(f"{L:.8f}")
    print(f"{h:.8f}")


if __name__ == "__main__":
    main()