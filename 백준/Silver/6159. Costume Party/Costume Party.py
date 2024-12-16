import sys 
input = sys.stdin.readline 

n, s = map(int, input().split())
a = sorted([int(input()) for _ in range(n)])

ans = 0
i, j = 0, n-1
while i < j:
    if a[i] + a[j] <= s:
        ans += (j - i)
        i += 1
    else: j -= 1

print(ans)