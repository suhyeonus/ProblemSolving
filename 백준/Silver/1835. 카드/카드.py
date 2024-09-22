from collections import deque 
N = int(input())
D = deque([N])

for i in range(N-1, 0, -1):
    D.appendleft(i)
    for j in range(i):
        D.appendleft(D.pop())
        
print(*D)