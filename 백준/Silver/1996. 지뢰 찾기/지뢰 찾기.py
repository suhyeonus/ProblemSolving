import sys 
input = sys.stdin.readline 

n = int(input())
bombmap = [list(input().rstrip()) for _ in range(n)]
ansmap = [[0] * n for _ in range(n)]

d = [(-1, 0), (-1, 1), (-1, -1), (0, 1), (0, -1), (1, 0), (1, 1), (1, -1)]

for i in range(n):
    for j in range(n):
        tmp = 0
        if bombmap[i][j] != '.': ansmap[i][j] = '*'
        else:
            for dx, dy in d:
                nx, ny =  dx + i, dy + j
                if 0<=nx<n and 0<=ny<n and bombmap[nx][ny] != '.':
                    tmp += int(bombmap[nx][ny])
            ansmap[i][j] = tmp if tmp < 10 else 'M'

for i in ansmap:
    print(*i, sep='')