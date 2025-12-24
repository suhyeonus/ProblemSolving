a, b = map(int, input().split())
ans = (25-a+b)*2 + 10
print(ans if ans > 0 else 0)