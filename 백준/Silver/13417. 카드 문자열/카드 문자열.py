from collections import deque
import sys 
input = sys.stdin.readline 

for _ in range(int(input())):
    n = int(input())
    apb = list(input().strip().split())
    new = deque([apb[0]])

    for i in apb[1:]:
        if i <= new[0]: new.appendleft(i)
        else: new.append(i)

    print(*new, sep='')