import sys 
input = sys.stdin.readline

cc = ['+', '-', '*', '/', '=']
calc  = 0
now_cc = '+'
while True:
    a = input().rstrip()
    if a in cc:
        if a == '=':
            print(calc)
            break 
        else:
            now_cc = a
    else:
        if now_cc == '+':
            calc += int(a)
        elif now_cc == '-':
            calc -= int(a)
        elif now_cc == '*':
            calc *= int(a)
        elif now_cc == '/':
            calc //= int(a)