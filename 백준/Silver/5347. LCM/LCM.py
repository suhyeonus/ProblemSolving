def gcd(x, y):
    if y == 0: return x
    else: return gcd(y, x%y)

for _ in range(int(input())):
    a, b = map(int, input().split())
    print(int(a*b/gcd(a,b)))