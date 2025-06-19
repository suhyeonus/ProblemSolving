for _ in range(int(input())):
    a, b = input().rstrip().split("-")
    val = 0

    for i in range(3):
        val += (ord(a[i]) - 65) * 26 ** (2-i)

    print("nice" if abs(val-int(b)) <= 100 else "not nice")