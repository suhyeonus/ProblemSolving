import sys 
input = sys.stdin.readline 

n = input().strip()
n = n.replace('()', '*')

ans = 0
now_stick = 0

for i in n:
    if i == '(':
        now_stick += 1
    elif i == ')':
        now_stick -= 1
        ans += 1
    else:
        ans += now_stick

print(ans)