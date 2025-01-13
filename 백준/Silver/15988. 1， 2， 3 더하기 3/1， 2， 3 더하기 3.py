import sys 
input = sys.stdin.readline 

dp = [1, 2, 4, 7]
for _ in range(int(input())):
    n = int(input())
    for i in range(len(dp), n):
        dp.append((dp[-1]+ dp[-2]+ dp[-3]) % 1000000009)
    print(dp[n-1]) 