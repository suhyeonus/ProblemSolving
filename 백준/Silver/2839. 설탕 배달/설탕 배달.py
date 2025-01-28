import sys 
input = sys.stdin.readline 

def dynamic(n):
    if n == 3 or n == 5: return 1
    elif n == 4: return -1

    dp = [-1] * (n+1)
    dp[3], dp[5] = 1, 1

    for i in range(6, n+1):
        if dp[i-3] > 0 and dp[i-5] > 0:
            dp[i] = min(dp[i-3], dp[i-5]) + 1
        elif dp[i-3] < 0 and dp[i-5] < 0:
            dp[i] = -1
        # 하나라도 음수면 성립이 안되기때문에 큰 값으로 해줘야야
        else:
            dp[i] = max(dp[i-3], dp[i-5]) + 1

    return dp[n]

n = int(input())
print(dynamic(n)) 