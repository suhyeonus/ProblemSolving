from collections import deque 
import sys 
input = sys.stdin.readline 

d = [(0, 1), (1, 0), (0, -1), (-1, 0)]
def bfs():
    # fire
    while q_f:
        x, y = q_f.popleft()
        for dx, dy in d:
            nx, ny = x + dx, y + dy 
            if 0<=nx<h and 0<=ny<w and graph[nx][ny] != '#' and not visit_f[nx][ny]:
                visit_f[nx][ny] = visit_f[x][y] + 1
                q_f.append((nx, ny)) 

    # sanggeun
    while q_s:
        x, y = q_s.popleft()
        for dx, dy in d:
            nx, ny = x + dx, y + dy
            if 0<=nx<h and 0<=ny<w:
                if graph[nx][ny] != '#' and not visit_s[nx][ny]:
                    if not visit_f[nx][ny] or visit_s[x][y] + 1 < visit_f[nx][ny]:
                        visit_s[nx][ny] = visit_s[x][y] + 1
                        q_s.append((nx, ny))
            else:
                return visit_s[x][y]
    
    return "IMPOSSIBLE"


for _ in range(int(input())):
    w, h = map(int, input().split())
    visit_f, visit_s = [[0] * w for _ in range(h)], [[0] * w for _ in range(h)]
    q_f, q_s = deque(), deque()
    
    graph = []
    for i in range(h):
        tmp = list(input().rstrip())
        for j in range(w):
            if tmp[j] == '*':
                visit_f[i][j] = 1
                q_f.append((i, j))
            elif tmp[j] == '@':
                visit_s[i][j] = 1
                q_s.append((i, j))
        graph.append(tmp)

    print(bfs())
    