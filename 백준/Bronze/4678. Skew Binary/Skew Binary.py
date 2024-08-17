while True:
    p = input().strip()
    if p == '0': exit(0)

    ans = 0
    for i in range(len(p)): ans += int(p[i]) * (2 ** (len(p)-i)-1)
    print(ans)