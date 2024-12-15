import sys 
input = sys.stdin.readline 

while True:
    n, m = map(int, input().split())
    if not n and not m: exit(0)
    sang = [int(input()) for _ in range(n)]
    suny = [int(input()) for _ in range(m)]

    ans = 0
    i, j = 0, 0
    while i < n and j < m:
        # if i == n or j == m:
        #     break 
        if sang[i] == suny[j]:
            ans += 1
            i += 1
            j += 1
        elif sang[i] < suny[j]:
            i += 1
        else: j += 1
    print(ans)