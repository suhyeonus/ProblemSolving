import sys 
input = sys.stdin.readline 

while True:
    line = input().rstrip()
    if line == ".": exit(0)

    stck = []
    for i in line:
        if i == '(' or i == '[':
            stck.append(i)
        elif i == ')':
            if stck and stck[-1] == '(':
                stck.pop()
            else: stck.append(i)
        elif i == ']':
            if stck and stck[-1] == '[':
                stck.pop()
            else: stck.append(i)
    print('no') if stck else print('yes')