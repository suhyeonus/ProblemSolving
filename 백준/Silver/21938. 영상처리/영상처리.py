from collections import deque 
import sys 
input = sys.stdin.readline 

# 세로 N, 가로 M 
n, m = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]
visit = [[0] * m for _ in range(n)]
t = int(input())

new_graph = []
for i in graph:
    tmp_list = []
    for j in range(1, m * 3 - 1, 3):
        tmp = (i[j-1] + i[j] + i[j+1]) / 3
        if tmp >= t: tmp_list.append(255)
        else: tmp_list.append(0)
    new_graph.append(tmp_list)

d = [(0, 1), (1, 0), (0, -1), (-1, 0)]
def bfs(u, v):
    q = deque()
    q.append((u, v))
    visit[u][v] = 1

    while q:
        x, y = q.popleft()
        for dx, dy in d:
            nx, ny = x + dx, y + dy 
            if 0<=nx<n and 0<=ny<m and visit[nx][ny] == 0 and new_graph[nx][ny] == 255:
                visit[nx][ny] = 1
                q.append((nx, ny))

ans = 0
for i in range(n):
    for j in range(m):
        if new_graph[i][j] == 255 and visit[i][j] == 0:
            bfs(i, j)
            ans += 1
print(ans)
