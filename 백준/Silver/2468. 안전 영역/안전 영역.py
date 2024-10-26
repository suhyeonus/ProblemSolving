from collections import deque 
import sys 
input = sys.stdin.readline 

n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]

d = [(0, 1), (0, -1), (1, 0), (-1, 0)]
def bfs(x, y, h):
    q = deque([(x, y)])
    visit[x][y] = 1

    while q:
        x, y = q.popleft()
        for dx, dy in d:
            nx = x + dx 
            ny = y + dy 
            if 0<=nx<n and 0<=ny<n and not visit[nx][ny] and graph[nx][ny] > h:
                visit[nx][ny] = 1
                q.append((nx, ny))

ans = []
for height in range(max(map(max, graph))):
    island = 0
    visit = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if graph[i][j] > height and not visit[i][j]:
                bfs(i, j, height)
                island += 1
    ans.append(island)

print(max(ans))