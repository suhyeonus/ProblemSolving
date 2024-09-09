import sys 
input = sys.stdin.readline 

N, K = map(int, input().split())
queue = [i for i in range(1, N+1)]
idx = 0
ans = []

while queue:
    idx += K - 1
    if idx >= len(queue): idx %= len(queue)
    ans.append(queue.pop(idx))

print("<" + ", ".join(map(str, ans)) + ">")