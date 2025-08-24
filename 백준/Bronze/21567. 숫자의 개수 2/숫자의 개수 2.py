n = [0] * 10
a, b, c = int(input()), int(input()), int(input())
for i in str(a*b*c):
    n[int(i)] += 1

print(*n, sep="\n")