for i in range(int(input())):
    ans = list(map(int, input().split()))
    count = 0
    for j in range(10):
        if ans[j] != j%5 + 1: count += 1
    if not count: print(i+1)