import sys 
input = sys.stdin.readline 

S = list(input().rstrip())
expl = input().rstrip()
stk = []

for i in S:
    stk.append(i)
    if ''.join(stk[-len(expl):]) == expl:
        for _ in range(len(expl)): stk.pop()

print(*stk, sep='') if stk else print("FRULA")