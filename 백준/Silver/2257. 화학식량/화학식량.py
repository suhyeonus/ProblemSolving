import sys 
input = sys.stdin.readline 

formula = list(input().rstrip())
chemical = ["H", "C", "O"]
stack = []

for i in formula:
    if i == "(":
        stack.append(i)

    elif i == ')':
        tmp = 0
        while True:
            element = stack.pop()
            if element == '(': break 
            tmp += element 
        stack.append(tmp)

    elif i in chemical:
        if i == 'H': stack.append(1)
        elif i == 'C': stack.append(12)
        else: stack.append(16)

    else:
        stack.append(stack.pop() * int(i))

print(sum(stack))