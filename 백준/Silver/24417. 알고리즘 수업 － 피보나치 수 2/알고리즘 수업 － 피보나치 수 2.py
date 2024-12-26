import sys 
input = sys.stdin.readline 

n = int(input())
x, y = 1, 1

for _ in range(n-2):
    x, y = y, (x+y)%1000000007

print(y, n-2)