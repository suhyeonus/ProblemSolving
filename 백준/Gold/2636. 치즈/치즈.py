from collections import deque 
import sys 
input = sys.stdin.readline 

# bfs
d = [(0, 1), (0, -1), (1, 0), (-1, 0)]
def bfs():
    q, melting = deque(), deque()
    q.append((0, 0))
    while q:
        x, y = q.popleft()
        for dx, dy in d:
            nx, ny = x + dx, y + dy
            if 0<=nx<n and 0<=ny<m and visit[nx][ny] == 0:
                visit[nx][ny] = 1
                if graph[nx][ny] == 0:
                    q.append((nx, ny))
                elif graph[nx][ny] == 1:
                    melting.append((nx, ny))
    for x, y in melting:
        graph[x][y] = 0
    return len(melting)

# init
n, m = map(int, input().split())
cheese = 0
graph = []
for i in range(n):
    graph.append(list(map(int, input().split())))
    cheese += sum(graph[i])

order = 1
while True: 
    visit = [[0] * m for _ in range(n)]
    melted_size = bfs()
    cheese -= melted_size
    if cheese == 0:
        print(order)
        print(melted_size)
        exit(0)
    order += 1
