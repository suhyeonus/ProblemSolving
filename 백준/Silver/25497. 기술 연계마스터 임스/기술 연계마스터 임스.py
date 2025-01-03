import sys 
input = sys.stdin.readline 

n = int(input())
ans = 0
skill = input().rstrip()
stack = []

for i in skill:
    if i == 'L' or i == 'S':
        stack.append(i)
    elif i == 'R':
        if 'L' in skill:
            stack.remove('L')
            ans += 1
        else: break
    elif i == 'K':
        if 'S' in stack:
            stack.remove('S')
            ans += 1
        else: break
    else: ans += 1

print(ans)