from collections import deque
import sys 
input = sys.stdin.readline 

n = int(input())
q = deque(list(map(int, input().split())))
wait = deque()

for i in range(1, n+1):
    if i in q:
        while True:
            if q[0] == i:
                q.popleft()
                break
            wait.append(q.popleft())
    elif i in wait:
        if wait[-1] == i:
            wait.pop() 

# print(f"q: {q}, wait: {wait}")
print("Nice") if not q and not wait else print("Sad")