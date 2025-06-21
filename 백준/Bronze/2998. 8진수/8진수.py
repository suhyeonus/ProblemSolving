n = 0
bi = input().rstrip()

x = 1
for i in range(len(bi)-1, -1, -1):
    n += int(bi[i]) * x
    x *= 2

print(oct(n)[2:])