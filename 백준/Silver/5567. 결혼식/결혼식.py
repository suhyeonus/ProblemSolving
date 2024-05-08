from collections import deque 
import sys 
input = sys.stdin.readline

N = int(input())
M = int(input())
visit = [0] * (N + 1)


graph = [[] for _ in range(N + 1)]
for _ in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

q = deque()
q.append(1)
visit[1] = 1
friend, depth = 0, 0

while q:
    depth += 1
    for _ in range(len(q)):
        c = q.popleft()
        for i in graph[c]:
            if visit[i] == 0:
                q.append(i)
                visit[i] = 1
                friend += 1
        
    if depth == 2: break 

print(friend)