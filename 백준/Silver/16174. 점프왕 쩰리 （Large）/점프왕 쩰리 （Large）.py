from collections import deque
import sys 
input = sys.stdin.readline

N = int(input())
graph = [list(map(int, input().split())) for _ in range(N)]
visit = [[0] * N for _ in range(N)]

q = deque()
q.append((0, 0))
visit[0][0] = 1

while q:
    x, y = q.popleft()
    if visit[N-1][N-1] == 1: break 

    d = [(0, graph[x][y]), (graph[x][y], 0)]
    for dx, dy in d:
        nx, ny = x + dx, y + dy 
        if 0<=nx<N and 0<=ny<N and visit[nx][ny] == 0:
            visit[nx][ny] = 1
            q.append((nx, ny))

print("HaruHaru") if visit[N-1][N-1] == 1 else print("Hing")