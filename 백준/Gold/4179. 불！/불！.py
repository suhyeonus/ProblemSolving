from collections import deque 
import sys 
input = sys.stdin.readline 

r, c = map(int, input().split())

dq_j, dq_f = deque(), deque()
visit_j, visit_f = [[0] * c for _ in range(r)], [[0] * c for _ in range(r)]
graph = []

for i in range(r):
    tmp = list(input().rstrip())
    for j in range(c):
        if tmp[j] == 'J':
            visit_j[i][j] = 1
            dq_j.append((i, j))
        elif tmp[j] == 'F':    
            visit_f[i][j] = 1
            dq_f.append((i, j))
    graph.append(tmp)

d = [(0, 1), (1, 0), (0, -1), (-1, 0)]

def bfs():
    # fire 
    while dq_f:
        x, y = dq_f.popleft()
        for dx, dy in d:
            nx = x + dx 
            ny = y + dy 

            if 0<=nx<r and 0<=ny<c and not visit_f[nx][ny] and graph[nx][ny] != '#':
                visit_f[nx][ny] = visit_f[x][y] + 1
                dq_f.append((nx, ny))

    # jihoon

    while dq_j:
        x, y = dq_j.popleft()
        for dx, dy in d:
            nx = x + dx 
            ny = y + dy 

            if 0<=nx<r and 0<=ny<c:
                if not visit_j[nx][ny] and graph[nx][ny] != '#':
                    if visit_j[x][y] + 1 < visit_f[nx][ny] or not visit_f[nx][ny]:
                        visit_j[nx][ny] = visit_j[x][y] + 1
                        dq_j.append((nx, ny))

            # 그래프 범위 밖이면 무사탈출로 간주
            else:
                return visit_j[x][y]
    return "IMPOSSIBLE"

print(bfs())