from collections import deque 
import sys 
input = sys.stdin.readline 

a, k = map(int, input().split())
visit = [-1] * 1000001

visit[a] = 0
q = deque([a])

while q:
    if visit[k] != -1:
        print(visit[k])
        break 
    x = q.popleft()
    for nx in (x + 1, x * 2):
        if 0<=nx<=1000000 and visit[nx] == -1:
            visit[nx] = visit[x] + 1
            q.append(nx)
