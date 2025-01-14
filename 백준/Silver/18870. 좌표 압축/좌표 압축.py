import sys 
input = sys.stdin.readline 

n = int(input())
graph = list(map(int, input().split()))

ans = {}
sortedGraph = sorted(list(set(graph)))

for i in range(len(sortedGraph)): ans[sortedGraph[i]] = i
for j in graph: print(ans[j], end=' ')