from collections import deque 
import sys 
input = sys.stdin.readline 

F, S, G, U, D = map(int, input().split())
visit = [-1] * (F + 1)

q = deque()
q.append(S)
visit[S] = 0

while q:
    x = q.popleft()
    if visit[G] != -1: break
    d = [U, -D]
    for dx in d:
        nx = x + dx 
        if 1<=nx<=F and visit[nx] == -1:
            visit[nx] = visit[x] + 1
            q.append(nx)

print(visit[G]) if visit[G] != -1 else print("use the stairs")