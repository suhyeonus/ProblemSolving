from collections import deque 
import sys 
input = sys.stdin.readline 

for _ in range(int(input())):
    N, M = map(int, input().split())

    # order : 차례를 저장, queue: 프린터 큐
    order = [0] * N 
    printq = list(map(int, input().split()))
    queue = deque([])
    for i in range(len(printq)): queue.append((printq[i], i))
    now = 1
    
    while queue:
        if order[M] != 0: break
        x, y = queue.popleft()
        if not queue or x >= max(queue, key=lambda x:x[0])[0]:
            order[y] = now 
            now += 1 
        else: queue.append((x, y))

    print(order[M])