import sys 
input = sys.stdin.readline 

num = [False, False] + [True] * 4000000

for i in range(2, 4000000):
    if num[i]:
        for j in range(i+i, 4000000, i):
            num[j] = False 

A, B, D = map(int, input().split())
ans = 0
for i in range(A, B+1):
    if num[i]:
        if str(D) in str(i): 
            ans += 1
print(ans)