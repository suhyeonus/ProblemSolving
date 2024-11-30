n, k = map(int, input().split())
index = 0
for i in range(1, n+1):
    if not n % i: index += 1
    if index == k:
        print(i)
        break 
else: print(0)