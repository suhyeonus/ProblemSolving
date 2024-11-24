import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
ans = []

def sol(idx):
    if len(ans) == m:
        print(*ans)
        return 
    for i in range(idx, n+1):
        ans.append(i)
        sol(i)
        ans.pop()

sol(1) 
