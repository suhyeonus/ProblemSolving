import sys 
input = sys.stdin.readline 

n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]
answer = [0, 0] # blue, white

def sol(n, x, y):
    now_color = graph[x][y]
    for i in range(x, x + n):
        for j in range(y, y + n):
            if graph[i][j] != now_color:
                sol(n//2, x, y)
                sol(n//2, x + n//2, y)
                sol(n//2, x, y + n//2)
                sol(n//2, x + n//2, y + n//2)
                return 
    if now_color: answer[0] += 1
    else: answer[1] += 1

    
sol(n, 0, 0)
print(answer[1])
print(answer[0])