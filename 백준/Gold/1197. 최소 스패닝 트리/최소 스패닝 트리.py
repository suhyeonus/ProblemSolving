import sys
import heapq
input = sys.stdin.readline

V, E = map(int, input().split())
graph = [[] for _ in range(V + 1)]
visited = [False] * (V + 1)
h = [(0, 1)]
order, sum = 0, 0

for _ in range(E):
    a = list(map(int, input().split()))
    graph[a[0]].append((a[2], a[1]))
    graph[a[1]].append((a[2], a[0]))

while h:
    if order == V:
        break
    w, s = heapq.heappop(h)
    if not visited[s]:
        visited[s] = True
        order += 1
        sum += w
        for i in graph[s]:
            heapq.heappush(h, i)
print(sum)