from collections import deque 
import sys 
input = sys.stdin.readline 

M, N = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(N)]
q = deque()
for i in range(N):
    for j in range(M):
        if graph[i][j] == 1:
            q.append((i, j))

d = [(-1, 0), (1, 0), (0, 1), (0, -1)]
def bfs():
    while q:
        x, y, = q.popleft()
        for dx, dy in d:
            nx = x + dx
            ny = y + dy 
            if 0<=nx<N and 0<=ny<M and graph[nx][ny] == 0:
                graph[nx][ny] = graph[x][y] + 1
                q.append((nx, ny))
bfs()
done = True
for i in range(N):
    for j in range(M):
        if graph[i][j] == 0:
            done = False 
            break 
print(-1) if not done else print(max(map(max, graph))-1)
