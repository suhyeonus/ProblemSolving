from collections import deque 
import sys 
input = sys.stdin.readline 

N, K = map(int, input().split())
visit = [-1] * 100001

visit[N] = 0 
q = deque()
q.append(N)

while q:
    x = q.popleft()
    if visit[K] != -1:
        print(visit[K])
        break 
    for nx in (x-1, x+1, 2*x):
        if 0<=nx<=100000 and visit[nx] == -1:
            visit[nx] = visit[x] + 1
            q.append(nx)
