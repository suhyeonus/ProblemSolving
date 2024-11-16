import sys 
input = sys.stdin.readline 

def sol(x, y, k):
    if k == 2:
        second = [graph[x][y], graph[x+1][y], graph[x][y+1], graph[x+1][y+1]]
        second.sort()
        return second[2]
    pooling = [sol(x, y, k//2), sol(x+k//2, y, k//2) ,sol(x, y+k//2, k//2), sol(x+k//2, y+k//2, k//2)]
    pooling.sort()
    return pooling[2]

n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]

print(sol(0, 0, n))