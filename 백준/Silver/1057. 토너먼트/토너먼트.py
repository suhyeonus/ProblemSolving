import sys 
input = sys.stdin.readline 

n, x, y = map(int, input().split())
ans = 0

while x != y:
    x -= x // 2
    y -= y // 2
    ans += 1
    
print(ans)