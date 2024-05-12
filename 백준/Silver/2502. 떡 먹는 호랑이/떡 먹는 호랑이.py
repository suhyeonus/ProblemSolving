import sys 
input = sys.stdin.readline 

D, K = map(int, input().split())

for i in range(1, 100000):
    for j in range(1, 100000):
        dp = [0] * (D + 1)
        dp[0], dp[1], dp[2] = 0, i, j

        for k in range(3, D + 1):
            dp[k] = dp[k-2] + dp[k-1]
            if dp[D] == K:
                print(dp[1])
                print(dp[2])
                exit(0)
