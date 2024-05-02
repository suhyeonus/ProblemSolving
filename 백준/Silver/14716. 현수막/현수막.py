from collections import deque 
import sys 
input = sys.stdin.readline 

M, N = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(M)]
visit = [[0] * (N) for _ in range(M)]

d = [(0, 1), (0, -1), (1, 0), (-1, 0), (1, 1), (1, -1), (-1, 1), (-1, -1)]
def bfs(i, j):
    visit[i][j] = 1
    q = deque()
    q.append((i, j))

    while q:
        x, y = q.popleft()
        for dx, dy in d:
            nx = x + dx 
            ny = y + dy 
            if 0<=nx<M and 0<=ny<N and visit[nx][ny] == 0 and graph[nx][ny] == 1:
                visit[nx][ny] = 1
                q.append((nx, ny))

ans = 0
for i in range(M):
    for j in range(N):
        if visit[i][j] == 0 and graph[i][j] == 1:
            bfs(i, j)
            ans += 1

print(ans)