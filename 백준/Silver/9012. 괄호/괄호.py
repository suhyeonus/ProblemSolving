import sys 
input = sys.stdin.readline 

for _ in range(int(input())):
    vps = list(input().strip())
    stk = []

    if len(vps) % 2 == 1: print("NO")
    else:
        for i in vps:
            if not stk: stk.append(i)
            elif i == ')':
                if stk[-1] != i:
                    stk.pop()
                else: stk.append(i)
            else: stk.append(i)

        print('NO') if stk else print('YES')