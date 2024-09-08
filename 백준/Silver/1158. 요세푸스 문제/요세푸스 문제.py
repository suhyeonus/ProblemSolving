import sys 
input = sys.stdin.readline 

N, K = map(int, input().split())
q = [i for i in range(1, N+1)]
ans = []
index = 0

while q:
    index += K - 1
    if index >= len(q): index %= len(q)
    ans.append(q.pop(index))

print("<" + ", ".join(map(str,ans)) + '>')