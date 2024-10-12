import sys
input = sys.stdin.readline

S = list(input().rstrip())
stack = []

for i in S:
    if i == '(':
        stack.append(i)
    else:
        if stack and stack[-1] == '(': stack.pop()
        else: stack.append(i)

print(len(stack)) 