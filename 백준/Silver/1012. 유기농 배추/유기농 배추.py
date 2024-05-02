# [1012] 유기농 배추 / 실버2 /

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0] 

def bfs(x, y):
    graph[x][y] = 0
    q = [(x, y)]

    while q:
        x, y = q.pop(0)
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            if graph[nx][ny] == 1:
                graph[nx][ny] = 0
                q.append((nx, ny))


t = int(input())
for _ in range(t):
    m, n, k = map(int, input().split())
    graph = [[0] * m for _ in range(n)]
    for _ in range(k):
        a, b = map(int, input().split())
        graph[b][a] = 1
    
    ans = 0
    for i in range(n):
        for j in range(m):
            if graph[i][j] == 1:
                ans += 1
                bfs(i, j)
    print(ans)