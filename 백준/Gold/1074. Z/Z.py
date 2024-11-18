import sys 
input = sys.stdin.readline 

n, r, c = map(int, input().split())

def sol(n, x, y):
    if n == 1:
        return 2*x + y
    return 2*(x%2) + (y%2) + 4*sol(n-1, x//2, y//2)

print(sol(n, r, c))