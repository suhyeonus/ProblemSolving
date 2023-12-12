# [16173] 점프왕 쩰리 (Small) / 실버4 / 15분

import sys
input = sys.stdin.readline

# 1. input & init
N = int(input())
graph = []
for _ in range(N):
    graph.append(list(map(int, input().split())))
visited = [[False] * N for _ in range(N)]

# 2. DFS
def dfs(x, y):
    # out of range - return
    if x < 0 or x >= N or y < 0 or y >= N:
        return

    visited[x][y] = True

    # dx, dy 선언
    dx = [graph[x][y], 0]
    dy = [0, graph[x][y]]

    for i in range(2):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < N and 0 <= ny < N and visited[nx][ny] == False:
            dfs(nx, ny)

# 3. DFS 실행
dfs(0, 0)
print("HaruHaru") if visited[-1][-1] == True else print("Hing")
