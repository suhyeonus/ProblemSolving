from collections import deque 
import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
q = deque()
graph = []
visit = [[0] * m for _ in range(n)]
for i in range(n):
    line = list(map(int, input().split()))
    for j in range(m):
        if line[j]:
            q.append((i, j))
    graph.append(line)

d = [(0, 1), (0, -1), (1, 0), (-1, 0), (1, 1), (1, -1), (-1, 1), (-1, -1)]
while q:
    x, y = q.popleft()
    for dx, dy in d:
        nx, ny = x + dx, y + dy 
        if 0<=nx<n and 0<=ny<m and not visit[nx][ny] and not graph[nx][ny]:
            q.append((nx, ny))
            visit[nx][ny] = visit[x][y] + 1

print(max(map(max, visit)))