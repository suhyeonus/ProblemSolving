a = int(input())
b = int(input())
c = int(input())
d = int(input())
p = int(input())

aa = a * p
if p <= c:
    bb = b 
else: bb = (p-c) * d + b
print(min(aa, bb))