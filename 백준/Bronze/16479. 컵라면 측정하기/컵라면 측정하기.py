import sys 
input = sys.stdin.readline 

k = int(input())
d1, d2 = map(int, input().split())
dist = (max(d1, d2) - min(d1, d2)) / 2
print(k**2 - dist**2)