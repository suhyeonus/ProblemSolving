from collections import deque 
import sys 
input = sys.stdin.readline 

M, N = map(int, input().split())
graph = [list(map(int, input().rstrip())) for _ in range(M)]
visit = [[False] * N for _ in range(M)]

q = deque()
for i in range(N):
    if graph[0][i] == 0:
        visit[0][i] = True 
        q.append((0, i))

d = [(1, 0), (-1, 0), (0, 1), (0, -1)]
while q:
    x, y = q.popleft()
    for dx, dy in d:
        nx, ny = x+dx, y+dy 
        if 0<=nx<M and 0<=ny<N and visit[nx][ny] == False and graph[nx][ny] == 0:
            if nx == M - 1:
                print("YES")
                exit(0)
            visit[nx][ny] = True 
            q.append((nx, ny))

print("YES") if True in visit[M-1] else print("NO")