N = int(input())
F = int(input())

minN = int(N / 100) * 100
maxN = minN + 99
ans = 0

for i in range(minN, maxN + 1):
    if i % F == 0:
        ans = i
        break 
print(str(ans)[-2:])
