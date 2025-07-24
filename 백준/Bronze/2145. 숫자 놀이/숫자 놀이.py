import sys 
input = sys.stdin.readline

while True:
    n = int(input())
    if not n: exit(0)
    while(n>9):
        n = sum(map(int, list(str(n))))
    print(n)