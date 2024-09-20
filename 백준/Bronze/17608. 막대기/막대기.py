import sys 
input = sys.stdin.readline 

n = int(input())
graph = []

for i in range(n):
    graph.append(int(input()))

key = graph[-1]
ans = 1

for i in range(n-2, -1, -1):
    if key < graph[i]: 
        ans += 1
        key = graph[i]

print(ans)