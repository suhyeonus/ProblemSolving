from collections import deque 
import sys 
input = sys.stdin.readline 

N, K = map(int, input().split())
visit = [-1] * 100001

visit[N] = 0
q = deque()
q.append(N)
while q:
    if visit[K] != -1:
        print(visit[K])
        break 
    x = q.popleft()

    # 우선순위 부여
    if 0<=2*x<=100000 and visit[2*x] == -1:
        q.appendleft(2*x)
        visit[2*x] = visit[x]
    if 0<=x-1<=100000 and visit[x-1] == -1:
        q.append(x-1)
        visit[x-1] = visit[x] + 1
    if 0<=x+1<=100000 and visit[x+1] == -1:
        q.append(x+1)
        visit[x+1] = visit[x] + 1
