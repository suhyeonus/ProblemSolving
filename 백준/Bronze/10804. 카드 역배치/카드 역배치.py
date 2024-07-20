initial = [i for i in range(1, 21)]
for _ in range(10):
    x, y = map(int, input().split())
    a = initial[x-1:y]
    initial[x-1:y] = a[::-1]
print(*initial)