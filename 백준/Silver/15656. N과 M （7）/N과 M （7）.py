import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
numlist = list(map(int, input().split()))
numlist.sort()
ans = []

def sol():
    if len(ans) == m:
        print(' '.join(map(str, ans)))
        return 
    for i in numlist:
        ans.append(i)
        sol()
        ans.pop()

sol()