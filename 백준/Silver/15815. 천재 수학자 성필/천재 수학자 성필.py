import sys 
input = sys.stdin.readline 

formula = input().rstrip()
operate = ['+', '-', '*', '/']
stack = []

for i in formula:
    if i in operate:
        tmp = stack.pop()
        if i == '+':
            stack.append(tmp + stack.pop())
        elif i == '-':
            stack.append(stack.pop() - tmp)
        elif i == '*':
            stack.append(tmp * stack.pop())
        elif i == '/':
            stack.append(stack.pop() // tmp)
    else:
        stack.append(int(i))

print(stack.pop())