from collections import deque 
import sys 
input = sys.stdin.readline 

cow = deque()
idx = 1

for _ in range(int(input())):
    prpt = list(input().strip().split())
    if prpt[0] == 'A':
        cow.appendleft(idx) if prpt[1] == 'L' else cow.append(idx)
        idx += 1
    else:
        for i in range(int(prpt[2])):
            if cow: cow.popleft() if prpt[1] == 'L' else cow.pop()
    
print(*cow, sep='\n')