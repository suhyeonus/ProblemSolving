from collections import deque
import sys 
input = sys.stdin.readline 

N, K, M = map(int, input().split())
q = deque(range(1, N+1))
idx = 0

while q:
    if idx // M % 2 == 0: # 정방형
        for _ in range(K - 1):
            q.append(q.popleft())
    else: #역방향
        for _ in range(K):
            q.appendleft(q.pop())

    idx += 1
    print(q.popleft())