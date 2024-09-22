from collections import deque 
import sys
input = sys.stdin.readline 

dq = deque()
for _ in range(int(input())):
    pr = list(map(int, input().split()))
    if pr[0] == 1: dq.appendleft(pr[1])
    elif pr[0] == 2: dq.append(pr[1])
    elif pr[0] == 3: print(dq.popleft()) if dq else print(-1)
    elif pr[0] == 4: print(dq.pop()) if dq else print(-1)
    elif pr[0] == 5: print(len(dq))
    elif pr[0] == 6: print(0) if dq else print(1)
    elif pr[0] == 7: print(dq[0]) if dq else print(-1)
    elif pr[0] == 8: print(dq[len(dq)-1]) if dq else print(-1)