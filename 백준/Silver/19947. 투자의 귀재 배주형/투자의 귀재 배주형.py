h, y = map(int, input().split())
dp = [h] * (y+1)

for i in range(1, y+1):
    dp[i] = dp[i-1] + dp[i-1]//20 
    if i >= 3:
        dp[i] = max(dp[i], dp[i-3] + dp[i-3]//5)
    if i >= 5:
        dp[i] = max(dp[i], dp[i-5] + int(dp[i-5]*35/100))

print(max(dp)) 