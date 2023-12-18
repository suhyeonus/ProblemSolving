# [1260] DFS와 BFS / 실버2 / 20분

import sys
input = sys.stdin.readline 

N, M, V = map(int, input().split())
graph = [[0] * (N + 1) for _ in range(N + 1)]
VB, VD = [False] * (N + 1), [False] * (N + 1)
ansB, ansD = [], []

for _ in range(M):
    x, y = map(int, input().split())
    graph[x][y] = 1
    graph[y][x] = 1

def bfs(v):
    VB[v] = True
    queue = [v]
    while queue:
        tmp = queue.pop(0)
        ansB.append(tmp)
        for i in range(1, N + 1):
            if VB[i] == False and graph[tmp][i] == 1:
                queue.append(i)
                VB[i] = True

def dfs(v):
    VD[v] = True
    ansD.append(v)

    for i in range(1, N + 1):
        if VD[i] == False and graph[v][i] == 1:
            dfs(i)

bfs(V)
dfs(V)

print(*ansD, sep=" ")
print(*ansB, sep=" ")
