import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
graph = [list(input().rstrip()) for _ in range(n)]
find = False

for i in range(min(n, m), 0, -1):
    for j in range(0, n-i):
        for k in range(0, m-i):
            if graph[j][k] == graph[j+i][k+i] == graph[j+i][k] == graph[j][k+i]:
                find = True
                print((i+1)**2)
                exit(0)

if not find: print(1)
