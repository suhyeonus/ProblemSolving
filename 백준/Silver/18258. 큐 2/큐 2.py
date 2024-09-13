from collections import deque 
import sys 
input = sys.stdin.readline 

s = deque([])
n = int(input())

for _ in range(n):
    cmd = list(input().strip().split())
    if cmd[0] == "push":
        s.append(int(cmd[1]))
    elif cmd[0] == "pop":
        print(s.popleft()) if len(s) != 0 else print(-1)
    elif cmd[0] == "size":
        print(len(s))
    elif cmd[0] == "empty":
        print(1) if len(s) == 0 else print(0)
    elif cmd[0] == "front":
        print(s[0]) if len(s) != 0 else print(-1)
    elif cmd[0] == "back":
        print(s[-1]) if len(s) != 0 else print(-1)
