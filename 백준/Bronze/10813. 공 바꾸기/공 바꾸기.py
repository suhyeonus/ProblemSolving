import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
a = [i for i in range(n + 1)]
for _ in range(m):
    x, y = map(int, input().split())
    a[x], a[y] = a[y], a[x]

print(*a[1:])