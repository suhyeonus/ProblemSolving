# [2667] 단지번호붙이기 / 실버1 / 25분
# https://www.acmicpc.net/problem/2667 
import sys

n = int(sys.stdin.readline())
graph = []
for i in range(n):
    graph.append(list(map(int, input())))

now_count = []
dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]
def bfs(x, y):
    now = 1
    graph[x][y] = 0
    q = [(x, y)]
    while q:
        x, y = q.pop(0)
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue 
            if graph[nx][ny] == 1:
                now += 1
                graph[nx][ny] = 0
                q.append((nx, ny))
                
    return now

for i in range(n):
    for j in range(n):
        if graph[i][j] == 1:
            now_count.append(bfs(i, j))
now_count.sort()
print(len(now_count))
print(*now_count, sep="\n")