import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
dp = [[0] * 1001 for _ in range(1001)]
for i in range(1, 1001):
    dp[1][i] = 1
    dp[i][1] = 1

for i in range(2, n+1):
    for j in range(2, m+1):
        dp[i][j] = (dp[i][j-1] + dp[i-1][j] + dp[i-1][j-1]) % 1000000007

print(dp[n][m] % 1000000007) 