m = int(input())
n = int(input())
ans = []

for i in range(int(m**0.5), int(n**0.5)+1):
    if m <= i*i <= n: ans.append(i*i)

print(f"{sum(ans)}\n{min(ans)}") if ans else print(-1)