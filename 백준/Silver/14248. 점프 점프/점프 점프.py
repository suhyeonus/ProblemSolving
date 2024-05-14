from collections import deque 
import sys 
input = sys.stdin.readline 

n = int(input())
graph = list(map(int, input().split()))
start = int(input())
visit = [False] * n 

q = deque()
q.append(start-1)
visit[start-1] = True
while q:
    x = q.popleft()
    for i in (-graph[x], graph[x]):
        if 0<=x+i<n and visit[x+i] == False:
            q.append(x + i)
            visit[x + i] = True 

cnt = 0
for i in visit:
    if i: cnt += 1
print(cnt)