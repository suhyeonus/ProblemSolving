from collections import deque 
import sys 
input = sys.stdin.readline 

n, k = map(int, input().split())
visit = [False] * 100001
route = [0] * 100001

ans = []
q = deque([(n, 0)])
visit[n] = True 
route[n] = 0

while q:
    x, t = q.popleft()
    if x == k:
        print(t)
        path = [x]
        index = x
        for i in range(t):
            index = route[index]
            path.append(index)
        print(*path[::-1])
        break 
    for nx in (x-1, x+1, 2*x):
        if 0<=nx<=100000 and not visit[nx]:
            visit[nx] = True
            q.append((nx, t + 1))
            route[nx] = x
