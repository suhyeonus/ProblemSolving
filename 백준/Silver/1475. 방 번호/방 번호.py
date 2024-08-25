N = input().strip()
a = [0] * 10
for i in N: a[int(i)] += 1

rev = a[6] + a[9]
if rev % 2 == 0:
    a[6], a[9] = rev//2, rev//2
else:
    a[6], a[9] = rev//2, rev//2+1

print(max(a))