import sys 
input = sys.stdin.readline 

m = ['a', 'e', 'i', 'o', 'u']
s = input().strip()
ans = 0

for i in s:
    if i in m:
        ans += 1

print(ans)