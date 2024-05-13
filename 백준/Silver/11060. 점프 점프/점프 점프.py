from collections import deque 
import sys 
input = sys.stdin.readline 

N = int(input())

# N == 1일 경우
if N == 1:
    print(0)
    exit(0)

maze = list(map(int, input().split()))
visit = [-1] * N

q = deque()
q.append((0, maze[0]))
visit[0] = 0

while q:
    x, value = q.popleft()
    for i in range(1, value + 1):
        if x + i < N and visit[x + i] == -1:
            visit[x + i] = visit[x] + 1
            q.append((x + i, maze[x + i]))
print(visit[-1])