n = int(input())
ans = 2000000

for i in range(1, n+1):
    tmp = 0
    for j in str(i): 
        tmp += int(j)
    if tmp + i == n: 
        ans = min(ans, i)

print(ans) if ans != 2000000 else print(0)