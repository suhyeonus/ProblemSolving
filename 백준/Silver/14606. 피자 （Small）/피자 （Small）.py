import sys 
input = sys.stdin.readline 

n = int(input())
dp = [0, 0, 1] + [0] * 8
for i in range(3, 11):
    tmp = i // 2
    dp[i] = tmp*(i-tmp) + dp[tmp] + dp[i-tmp]

print(dp[n])