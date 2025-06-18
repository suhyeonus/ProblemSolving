a = []
for _ in range(int(input())):
    a.append(int(input()))

if a[1]-a[0] == a[2]-a[1]:
    print(a[-1] + a[1]-a[0])
else: print(a[-1] * (a[1]//a[0]))