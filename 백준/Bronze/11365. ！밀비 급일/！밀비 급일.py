import sys 
input = sys.stdin.readline 

while True:
    s = input().strip()
    if s == 'END':
        exit(0)
    print(s[::-1])