import sys 
input = sys.stdin.readline 

n = int(input())
student = [input().rstrip() for _ in range(n)]

for i in range(1, len(student[0]) + 1):
    num = []
    for j in range(len(student)):
        if student[j][-i:] not in num:
            num.append(student[j][-i:])
        else: break 
    if len(num) == len(student):
        print(i)
        exit(0)