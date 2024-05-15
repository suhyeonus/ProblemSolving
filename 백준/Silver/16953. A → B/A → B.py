import sys 
input = sys.stdin.readline 

ans = 0
a, b = map(int, input().split())
while True:
    ans += 1
    tmp = b
    if b == a: break 
    if b % 10 == 1:
        b //= 10
    elif b % 2 == 0:
        b //= 2
    if tmp == b:
        print(-1)
        exit(0)
print(ans)