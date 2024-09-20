import sys 
input = sys.stdin.readline 

n = int(input())
cal = list(input().strip())
alp = [int(input()) for _ in range(n)]
stk = []

for i in cal:
    if 65 <= ord(i) <= 90:
        stk.append(alp[ord(i)-65])
    else:
        a = stk.pop()
        b = stk.pop()
        if i == '+': stk.append(a+b)
        elif i == '*': stk.append(a*b)
        elif i == '-': stk.append(b-a)
        elif i == '/': stk.append(b/a)

print("%.2f" %stk[0])