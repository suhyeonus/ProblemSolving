from collections import deque 
import sys 
input = sys.stdin.readline 

N = int(input())
order = list(map(int, input().split()))
balln = deque([i for i in range(1, N+1)])
idx = order[balln[0]-1]
ans = [balln.popleft()]

while balln:
    if idx > 0:
        for i in range(idx-1):
            balln.append(balln.popleft())
    else:
        for i in range(-idx):
            balln.appendleft(balln.pop())
    idx = order[balln[0]-1]
    if balln: ans.append(balln.popleft())

print(*ans)