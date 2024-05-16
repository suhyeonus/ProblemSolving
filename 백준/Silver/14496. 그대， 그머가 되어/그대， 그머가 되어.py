from collections import deque 
import sys 
input = sys.stdin.readline 

a, b = map(int, input().split())
n, m = map(int, input().split())
graph = [[] for _ in range(n + 1)]
visit = [-1] * (n + 1)
for _ in range(m):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

q = deque()
q.append(a)
visit[a] = 0
while q:
    v = q.popleft()
    if v == b: break
    for i in graph[v]:
        if visit[i] == -1:
            visit[i] = visit[v] + 1
            q.append(i)

print(visit[b])