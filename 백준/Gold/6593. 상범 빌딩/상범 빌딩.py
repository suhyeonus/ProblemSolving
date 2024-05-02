from collections import deque 
import sys 
input = sys.stdin.readline 

while True:
    extime, exited = 0, False # 소요시간, 탈출여부
    q = deque()

    L, R, C = map(int, input().split())
    if L==0 and R==0 and C==0: break # 종료

    # 방문 및 그래프
    visit = [[[0] * C for _ in range(R)] for _ in range(L)]
    graph = []

    # 그래프 입력
    for i in range(L):
        tmp = []
        for j in range(R):
            stair = list(input().rstrip())
            # 시작점 판별
            for k in range(C):
                if stair[k] == 'S': 
                    q.append((i, j, k, 0))
                    visit[i][j][k] = 1
            tmp.append(stair)
        graph.append(tmp)
        nul = input() # 공백

    # bfs
    d = [(1, 0, 0), (-1, 0, 0), (0, 1, 0), (0, -1, 0), (0, 0, 1), (0, 0, -1)]
    while q:
        x, y, z, depth = q.popleft()
        if graph[x][y][z] == 'E':
            exited = True
            extime = depth
            break 
        else:
            for dx, dy, dz in d:
                nx, ny, nz = x + dx, y + dy, z + dz
                if 0<=nx<L and 0<=ny<R and 0<=nz<C and visit[nx][ny][nz] == 0 and graph[nx][ny][nz] != '#':
                    visit[nx][ny][nz] = 1
                    q.append((nx, ny, nz, depth + 1))

    print(f'Escaped in {extime} minute(s).') if exited else print('Trapped!')