from collections import deque 
import sys 
input = sys.stdin.readline 

d = [(0, 1), (1, 0), (0, -1), (-1, 0)]
def bfs(i, j):
    q = deque([(i, j)])
    while q:
        i, j = q.popleft()
        for dx, dy in d:
            nx, ny = i + dx, j + dy
            if 0<=nx<r and 0<=ny<c and not visit[nx][ny] and graph[nx][ny] == 1:
                visit[nx][ny] = 1
                q.append((nx, ny))

for tc in range(int(input())):
    print(f"Case #{tc+1}:")

    r, c = map(int, input().split())
    graph = [list(map(int, input().strip())) for _ in range(r)]
    
    for _ in range(int(input())):
        prompt = list(input().strip().split())
        if prompt[0] == 'M':
            graph[int(prompt[1])][int(prompt[2])] = int(prompt[3])
        
        elif prompt[0] == 'Q':
            visit = [[0] * c for _ in range(r)]
            count = 0
        
            for i in range(r):
                for j in range(c):
                    if not visit[i][j] and graph[i][j]:
                        count += 1
                        bfs(i, j)
            print(count)