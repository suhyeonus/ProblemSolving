import sys 
input = sys.stdin.readline 

N = int(input())
prpt = list(input().strip())

for _ in range(N-1):
    new = list(input().strip())
    for i in range(len(new)):
        if prpt[i] != new[i]:
            prpt[i] = '?'        

print(*prpt, sep='')
