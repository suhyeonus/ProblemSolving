import heapq 
import sys 
input = sys.stdin.readline 

q = []
for _ in range(int(input())):
    x = int(input())
    if x != 0:
        heapq.heappush(q, (abs(x), x))
    else:
        print(heapq.heappop(q)[1]) if len(q) > 0 else print(0)