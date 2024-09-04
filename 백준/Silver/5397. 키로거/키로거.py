import sys 
input = sys.stdin.readline 

for _ in range(int(input())):
    a = list(input().rstrip())
    cursor, tmp = [], []

    for i in a:
        if i == '<':
            if len(cursor) > 0: tmp.append(cursor.pop())
        elif i == '>':
            if len(tmp) > 0: cursor.append(tmp.pop())
        elif i == '-':
            if len(cursor) > 0: cursor.pop()
        else: cursor.append(i)
    print(*cursor, sep='', end='')
    print(*tmp[::-1], sep='')
