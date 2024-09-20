import sys 
input = sys.stdin.readline 

n = int(input())
top = list(map(int, input().split()))
stk = []
ans = [0] * n

for i in range(n):
    while stk:
        if stk[-1][1] > top[i]:
            ans[i] = stk[-1][0] + 1
            break 
        else:
            stk.pop()
    stk.append((i, top[i]))
print(*ans)