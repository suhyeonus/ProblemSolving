from collections import deque 
import sys 
input = sys.stdin.readline 

n = int(input())
buffer = deque()

while True:
    router = int(input())
    if router == -1: break 
    elif router == 0:
        if len(buffer): buffer.popleft()
    else:
        if len(buffer) < n: buffer.append(router)

print(*buffer) if buffer else print("empty")