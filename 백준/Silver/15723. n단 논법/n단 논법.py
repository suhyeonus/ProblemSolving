from collections import deque 
import sys 
input = sys.stdin.readline 

def bfs(x, y):
    q = deque()
    q.append(x)

    while q:
        n = q.popleft()
        if n == y: return "T"
        if graph[n] and not visit[graph[n]]:
            q.append(graph[n]) 

    return "F"

graph = [0] * 27 

for _ in range(int(input())):
    start, end = input().rstrip().split(" is ")
    graph[ord(start)-96] = ord(end)-96

for _ in range(int(input())):
    p1, p2 = input().rstrip().split(" is ")
    visit = [0] * 27
    print(bfs(ord(p1)-96, ord(p2)-96))