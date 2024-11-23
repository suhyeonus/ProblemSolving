import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
ans = []

def sol(idx):
    if len(ans) == m:
        print(*ans)
        return 
    for i in range(idx, n+1):
        if i not in ans:
            ans.append(i)
            sol(i+1)
            ans.pop()

sol(1)
