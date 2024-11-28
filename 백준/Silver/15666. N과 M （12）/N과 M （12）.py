import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
num_list = list(map(int, input().split()))
num_list.sort()
ans = []

def sol(idx):
    if len(ans) == m:
        print(*ans)
        return 
    
    tmp = 0
    for i in range(idx, n):
        if num_list[i] != tmp:
            tmp = num_list[i]
            ans.append(num_list[i])
            sol(i)
            ans.pop()

sol(0)