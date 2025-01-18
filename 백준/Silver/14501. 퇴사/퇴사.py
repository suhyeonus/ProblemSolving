import sys 
input = sys.stdin.readline 

n = int(input())
table = [list(map(int, input().split())) for _ in range(n)]
dp = [0] * (n+1)

for i in range(n):
    for j in range(i+table[i][0], n+1):
        if dp[j] < dp[i] + table[i][1]:
            dp[j] = dp[i] + table[i][1]
print(max(dp))
