import sys 
input = sys.stdin.readline 

dp = [1, 1] + [0] * 9999
for i in range(2, 10001):
    dp[i] = dp[i-1] + dp[i-2]

for testCase in range(int(input())):
    P, Q = map(int, input().split())
    print(f"Case #{testCase + 1}: {dp[P-1] % Q}")