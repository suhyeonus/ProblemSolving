import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
chess = [list(input().rstrip()) for _ in range(n)]
ans = 3000

for i in range(n-7):
    for j in range(m-7):
        black, white = 0, 0
        for x in range(i, i+8):
            for y in range(j, j+8):
                if not (x+y) % 2:
                    if chess[x][y] == 'B': white += 1
                    else: black += 1
                else:
                    if chess[x][y] == 'B': black += 1
                    else: white += 1

        ans = min(ans, min(black, white))

print(ans)