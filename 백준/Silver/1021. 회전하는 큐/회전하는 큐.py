from collections import deque 

N, M = map(int, input().split())
index = list(map(int, input().split()))
D = deque([i for i in range(1, N+1)])

ans = 0
for i in index:
    while True:
        if D[0] == i:
            D.popleft()
            break
        else:
            if D.index(i) <= len(D) // 2:
                tmp = D.popleft()
                D.append(tmp)
                ans += 1
            else:
                tmp = D.pop()
                D.appendleft(tmp)
                ans += 1

print(ans)