import sys 
input = sys.stdin.readline 

n, k = map(int, input().split())
coins = [int(input()) for _ in range(n)]

ans = 0
for i in coins[::-1]:
    ans += k // i 
    k %= i
    if k == 0: break 

print(ans)