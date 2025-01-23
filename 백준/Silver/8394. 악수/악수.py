import sys 
input = sys.stdin.readline 

n = int(input())

if n <= 3: 
    print(n)

else:
    # initialize
    dp = [0] * (n+1)
    dp[1] = 1
    dp[2] = 2

    # dp
    for i in range(3, n+1):
        dp[i] = (dp[i-1] + dp[i-2]) % 10
    
    print(dp[n]) 