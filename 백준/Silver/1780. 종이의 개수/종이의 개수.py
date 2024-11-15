import sys 
input = sys.stdin.readline 

n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]
ans = [0, 0 ,0] # -1, 0, 1

def sol(n, x, y):
    index = graph[x][y]
    for i in range(x, x+n):
        for j in range(y, y+n):
            if index != graph[i][j]:
                next = n // 3
                sol(next, x, y)
                sol(next, x, y + next)
                sol(next, x, y + (next*2))
                sol(next, x + next, y)
                sol(next, x + next, y + next)
                sol(next, x + next, y + (next*2))
                sol(next, x + (next*2), y)
                sol(next, x + (next*2), y + next)
                sol(next, x + (next*2), y + (next*2))
                return 
    ans[index+1] += 1

sol(n, 0, 0)
print(*ans, sep='\n')