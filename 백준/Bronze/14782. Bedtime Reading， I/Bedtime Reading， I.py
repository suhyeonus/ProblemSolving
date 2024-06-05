n = int(input())
nlist = [1, n]

for i in range(2, n):
    if n % i == 0: nlist.append(i)

print(sum(nlist))