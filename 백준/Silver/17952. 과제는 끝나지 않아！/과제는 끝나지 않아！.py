import sys 
input = sys.stdin.readline 

stk = []
scr = 0
n = int(input())
for _ in range(n):
    asm = list(map(int, input().split()))
    if asm[0] == 1:
        stk.append([asm[1], asm[2]-1])
    elif asm[0] == 0 and stk:
        stk[-1][1] -= 1
    
    if stk and stk[-1][1] == 0:
        tmp = stk.pop()
        scr += tmp[0]

print(scr)