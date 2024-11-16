import sys 
input = sys.stdin.readline 

def sol(x, y, k):
    if k == 1: return graph[x][y]
    prize = [sol(x, y, k//2), sol(x+k//2, y, k//2) ,sol(x, y+k//2, k//2), sol(x+k//2, y+k//2, k//2)]
    prize.sort()
    return prize[1]

n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]
print(sol(0, 0, n))