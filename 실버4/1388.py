# [1388] 바닥 장식 / 실버4 / 20분

import sys
input = sys.stdin.readline

# 1. 입력받기 및 init
n, m = map(int, input().split())
answer = 0
visited = [[False] * m for _ in range(n)]
graph = []
for _ in range(n):
    graph.append(list(input()))

# 2. dfs 함수 선언
def dfs(x, y):
    visited[x][y] = True

    # case 1. |
    if graph[x][y] == "|":
        # 범위 내인지 체크
        if x + 1 < n and graph[x + 1][y] == "|" and  visited[x + 1][y] == False:
            dfs(x + 1, y)
    
    # case 2. -
    elif graph[x][y] == "-":
        if y + 1 < m and graph[x][y + 1] == "-" and visited[x][y + 1] == False:
            dfs(x, y + 1)

# 3. dfs 실행
for i in range(n):
    for j in range(m):
        if visited[i][j] == False:
            dfs(i, j)
            answer += 1
print(answer)
