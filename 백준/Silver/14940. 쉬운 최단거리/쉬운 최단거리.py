from collections import deque 
import sys
input = sys.stdin.readline 

n, m = map(int, input().split())
visit = [[-1] * m for _ in range(n)]
graph = []
q = deque()
for i in range(n):
    tmp = list(map(int, input().split()))
    graph.append(tmp)
    for j in range(m):
        if tmp[j] == 2:
            q.append((i, j, 0))
            visit[i][j] = 0

d = [(1, 0), (-1, 0), (0, 1), (0, -1)]
while q:
    x, y, depth = q.popleft()
    for dx, dy in d:
        nx, ny = x + dx, y + dy 
        if 0<=nx<n and 0<=ny<m and visit[nx][ny] == -1 and graph[nx][ny] == 1:
            visit[nx][ny] = depth + 1
            q.append((nx, ny, depth + 1))

for i in range(n):
    for j in range(m):
        if visit[i][j] == -1:
            if graph[i][j] == 0:
                visit[i][j] = 0

for i in visit:
    print(*i)