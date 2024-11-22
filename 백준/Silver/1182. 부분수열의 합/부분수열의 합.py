import sys 
input = sys.stdin.readline 

n, s = map(int, input().split())
seq = list(map(int, input().split()))
ans = 0
num = []

def sol(idx):
    global ans
    if sum(num) == s and len(num) > 0:
        ans += 1
    for i in range(idx, n):
        num.append(seq[i])
        sol(i+1)
        num.pop()

sol(0)
print(ans)