li = []
n = int(input())
for _ in range(n):
    name, day, month, year = input().rstrip().split()
    li.append((name, int(day), int(month), int(year)))

li.sort(key=lambda x:(x[3], x[2], x[1]))

print(li[n-1][0])
print(li[0][0])
