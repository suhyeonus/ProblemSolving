for test_case in range(1, 11):
    n = int(input())
    brackets = input().rstrip()
    
    opening = ['(', '<', '[', '{']
    closing = [')', '>', ']', '}']
    stack = []
    
    for b in brackets:
        if b in opening:
            stack.append(b)
        else:
            for i in range(4):
                if b == closing[i]:
                    if stack and stack[-1] == opening[i]:
                        stack.pop()
                    else: stack.append(b)
                        
    print(f"#{test_case}", end=' ')
    print(1) if not stack else print(0)