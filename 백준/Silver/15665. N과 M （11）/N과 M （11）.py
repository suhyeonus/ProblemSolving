import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
num_list = list(map(int, input().split()))
num_list.sort()

ans = []

def sol():
    if len(ans) == m:
        print(*ans)
        return 
    
    tmp = 0
    for i in num_list:
        if tmp != i:
            tmp = i
            ans.append(i)
            sol()
            ans.pop()

sol()
