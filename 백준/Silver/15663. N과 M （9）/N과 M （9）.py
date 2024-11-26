import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
num_list = list(map(int, input().split()))
num_list.sort()

visit = [0] * n
ans = []

def sol():
    if len(ans) == m:
        print(*ans)
        return 
    
    idx = 0
    for i in range(n):
        if not visit[i] and idx != num_list[i]:
            ans.append(num_list[i])
            visit[i] = 1
            idx = num_list[i]
            sol()
            ans.pop()
            visit[i] = 0

sol() 
