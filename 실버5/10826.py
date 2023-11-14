# [10826] 피보나치 수 4 / 실버5 / 10분

import sys
input = sys.stdin.readline

dp = [0, 1]
n = int(input())
for i in range(2, n + 1):
    dp.append(dp[i - 1] + dp[i - 2])
print(dp[n])
