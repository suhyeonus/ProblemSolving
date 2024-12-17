import sys 
input = sys.stdin.readline 

for _ in range(int(input())):
    k = int(input())
    n = int(input())
    dp = [[0] * 15 for _ in range(15)]
    for i in range(15): dp[0][i] += i 

    for x in range(1, k+1):
        for y in range(1, n+1):
            dp[x][y] += sum(dp[x-1][:(y+1)])

    print(dp[k][n])