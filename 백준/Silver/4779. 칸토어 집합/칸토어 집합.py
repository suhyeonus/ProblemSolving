import sys 
input = sys.stdin.readline 

def sol(start, x):
    if x == 1: return
    for i in range(start + x//3, start + (x//3) * 2):
        line[i] = ' '
    sol(start, x//3)
    sol(start + (x//3) * 2, x//3)

while True:
    try:
        n = int(input())
        line = ['-'] * (3**n)
        sol(0, 3**n)
        print(*line, sep='')
    except Exception as e:
        exit(0)