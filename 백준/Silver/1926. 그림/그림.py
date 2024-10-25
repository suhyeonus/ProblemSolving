from collections import deque 
import sys 
input = sys.stdin.readline 

M, N = map(int, input().split())
visit = [[0] * N for _ in range(M)]
graph = []
for _ in range(M):
    graph.append(list(map(int, input().split())))

ans = []
d = [(1, 0), (-1, 0), (0, 1), (0, -1)]
def bfs(y, x):
    q = deque()
    q.append((y, x))
    visit[y][x] = 1
    cnt = 1

    while q:
        y, x = q.popleft()
        for dy, dx in d:
            ny = y + dy 
            nx = x + dx 
            if 0<=ny<M and 0<=nx<N and visit[ny][nx] == 0 and graph[ny][nx] == 1:
                visit[ny][nx] = 1
                q.append((ny, nx))
                cnt += 1
    ans.append(cnt)

for i in range(M):
    for j in range(N):
        if visit[i][j] == 0 and graph[i][j] == 1:
            bfs(i, j)

print(len(ans))
print(max(ans)) if len(ans) > 0 else print(0)