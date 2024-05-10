import sys 
sys.setrecursionlimit(10**6)
input = sys.stdin.readline 

n = int(input())
visit = [False] * (n+1)
graph = [[] for _ in range(n+1)]
for _ in range(n-1):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

def dfs(v):
    for i in graph[v]:
        if visit[i] == False:
            visit[i] = v 
            dfs(i)

dfs(1)
print(*visit[2:], sep='\n')
