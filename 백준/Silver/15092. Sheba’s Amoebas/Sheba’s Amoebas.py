from collections import deque 
import sys 
input = sys.stdin.readline 

r, w = map(int, input().split())
graph = [list(input().rstrip()) for _ in range(r)]
visit = [[0] * w for _ in range(r)]

d = [(1, 0), (1, -1), (1, 1), (0, 1), (0, -1), (-1 ,0), (-1, 1), (-1, -1)]
def bfs(i, j):
    q = deque([(i, j)])
    while q:
        x, y = q.popleft()
        for dx, dy in d:
            nx, ny = x + dx, y + dy 
            if 0<=nx<r and 0<=ny<w and not visit[nx][ny] and graph[nx][ny] == '#':
                visit[nx][ny] = 1
                q.append((nx, ny))

ans = 0
for i in range(r):
    for j in range(w):
        if not visit[i][j] and graph[i][j] == '#':
            ans += 1
            bfs(i, j)

print(ans)