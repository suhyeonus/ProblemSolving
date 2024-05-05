from collections import deque 
import sys 
input = sys.stdin.readline 

M, N, H = map(int, input().split())
q = deque()
graph = [[list(map(int, input().split())) for _ in range(N)] for _ in range(H)]
for i in range(H):
    for j in range(N):
        for k in range(M):
            if graph[i][j][k] == 1:
                q.append((i, j, k))

d = [(1, 0, 0), (-1, 0, 0), (0, 1, 0), (0, -1, 0), (0, 0, 1), (0, 0, -1)]
def bfs():
    while q:
        x, y, z = q.popleft()
        for dx, dy, dz in d:
            nx, ny, nz = x + dx, y + dy, z + dz
            if 0<=nx<H and 0<=ny<N and 0<=nz<M and graph[nx][ny][nz] == 0:
                graph[nx][ny][nz] = graph[x][y][z] + 1
                q.append((nx, ny, nz))

bfs()
ans = 0
for i in graph:
    for j in i:
        for k in j:
            if k == 0:
                print(-1)
                exit(0)
        ans = max(ans, max(j))
print(ans-1)