from collections import deque 
import sys 
input = sys.stdin.readline 

for _ in range(int(input())):
    N, M = map(int, input().split())

    # now: index, order: 각 index의 초기 순서를 저장
    now = 1
    order = [0] * N 

    # printq: 입력받은 큐
    # queue: 입력받은 큐를 초기 순서와 함께 튜플화
    printq = list(map(int, input().split()))
    queue = deque([])
    for i in range(len(printq)): queue.append((printq[i], i))
    
    while queue:
        if order[M]: break

        # x: 프린터 큐의 원소, y: x의 초기 순서
        x, y = queue.popleft()
        if not queue or x >= max(queue, key=lambda x:x[0])[0]:
            order[y] = now 
            now += 1 
        else: queue.append((x, y))

    print(order[M])