# [10026] 적록색약 / 골드5 / 인터넷 참고

def bfs(x, y):
    dx = [-1, 0, 0, 1]
    dy = [0, 1, -1, 0]

    q = [(x, y)]
    while q:
        x, y = q.pop(0)
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < N and 0 <= ny < N and visited[nx][ny] == 0 and graph[nx][ny] == graph[x][y]:
                q.append((nx, ny))
                visited[nx][ny] = 1
 
N = int(input())
visited = [[0] * N for _ in range(N)]
graph = []
for _ in range(N):
    graph.append(list(input()))

# 1. 색약이 아닐 경우
ans_non = 0
for i in range(N):
    for j in range(N):
        if visited[i][j] == 0:
            bfs(i, j)
            ans_non += 1

# 2. 적록색약일 경우
for i in range(N):
    for j in range(N):
        if graph[i][j] == 'G':
            graph[i][j] = 'R'

visited = [[0] * N for _ in range(N)]
ans_blind = 0
for i in range(N):
    for j in range(N):
        if visited[i][j] == 0:
            bfs(i, j)
            ans_blind += 1

print(ans_non, ans_blind)
