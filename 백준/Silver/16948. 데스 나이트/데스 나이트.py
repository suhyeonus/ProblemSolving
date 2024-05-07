from collections import deque 
import sys 
input = sys.stdin.readline 

N = int(input())
visit = [[-1] * N for _ in range(N)]
r1, c1, r2, c2 = map(int, input().split())
q = deque()
q.append((r1, c1))
visit[r1][c1] = 0

d = [(-2, -1), (-2, 1), (0, -2), (0, 2), (2, -1), (2, 1)]
while q:
    x, y = q.popleft()
    if (x, y) == (r2, c2): break 
    for dx, dy in d:
        nx, ny = x + dx, y + dy
        if 0<=nx<N and 0<=ny<N and visit[nx][ny] == -1:
            visit[nx][ny] = visit[x][y] + 1
            q.append((nx, ny))

print(visit[r2][c2]) 