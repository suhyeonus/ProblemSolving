import sys 
input = sys.stdin.readline 

N, M = map(int, input().split())
A = sorted(list(map(int, input().split())))
select = []

def dfs(start):
    if len(select) == M:
        print(*select)
        return 
    for i in range(start, N):
        if A[i] not in select:
            select.append(A[i])
            dfs(i + 1)
            select.pop()

dfs(0)