from collections import deque 
import sys
input = sys.stdin.readline 

# N 가로 M 세로
N, M = map(int, input().split())
graph = [list(input().rstrip()) for _ in range(M)]
visit = [[False] * N for _ in range(M)]
wlist, blist = [], []

d = [(1, 0), (-1, 0), (0, 1), (0, -1)]
def bfs(i, j):
    q = deque()
    q.append((i, j))
    visit[i][j] = True 
    cnt = 1

    while q:
        x, y = q.popleft()
        for dx, dy in d:
            nx, ny = x + dx, y + dy
            if 0<=nx<M and 0<=ny<N and not visit[nx][ny] and graph[nx][ny] == graph[x][y]:
                visit[nx][ny] = True 
                cnt += 1
                q.append((nx, ny))

    if graph[i][j] == 'W': wlist.append(cnt)
    else: blist.append(cnt)

for i in range(M):
    for j in range(N):
        if not visit[i][j]:
            bfs(i, j)

answ, ansb = 0, 0
for i in wlist:
    answ += i * i 
for i in blist:
    ansb += i * i
print(answ, ansb)