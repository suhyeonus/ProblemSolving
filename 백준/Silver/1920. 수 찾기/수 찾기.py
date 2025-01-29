import sys 
input = sys.stdin.readline 

N = int(input())
A = set(map(int, input().split()))
M = int(input())
X = list(map(int, input().split()))

for i in X:
    print(1) if i in A else print(0) 