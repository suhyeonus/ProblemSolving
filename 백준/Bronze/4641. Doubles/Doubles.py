while True:
    n = list(map(int, input().split()))
    if n == [-1]: break 

    n = n[:-1]
    n.sort()
    
    ans = 0
    for i in range(len(n)):
        for j in range(i+1, len(n)):
            if n[j] == n[i] * 2:
                ans += 1
                continue
    
    print(ans)