import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
numlist = list(map(int, input().split()))
numlist.sort()
ans = []

def sol(idx):
    if len(ans) == m:
        print(*ans)
        return 
    for i in range(idx, n):
        if numlist[i] not in ans:
            ans.append(numlist[i])
            sol(i+1)
            ans.pop()

sol(0)
