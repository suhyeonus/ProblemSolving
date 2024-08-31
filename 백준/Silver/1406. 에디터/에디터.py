import sys 
input = sys.stdin.readline 

sen1 = list(input().rstrip())
sen2 = []

for _ in range(int(input())):
    edit = list(input().rstrip().split())
    if edit[0] == 'L':
        if len(sen1) > 0: sen2.append(sen1.pop())
    elif edit[0] == 'D':
        if len(sen2) > 0: sen1.append(sen2.pop())
    elif edit[0] == 'B':
        if len(sen1) > 0: sen1.pop()
    else:
        sen1.append(edit[1])

print(*sen1, sep='', end='')
print(*sen2[::-1], sep='')