import sys 
input = sys.stdin.readline 

n, k = map(int, input().split())
dp = [[0] * (n) for _ in range(n)]

for i in range(n):
    dp[0][i] = 1
    dp[i][0] = 1

for i in range(1, n):
    for j in range(1, n):
        dp[i][j] = dp[i-1][j] + dp[i][j-1]

print(dp[k-1][n-k]) 