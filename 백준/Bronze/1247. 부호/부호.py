import sys 
input = sys.stdin.readline

for _ in range(3):
    n = int(input())
    summed = 0
    for _ in range(n):
        summed += int(input())
    if summed == 0:
        print(0)
    else:
        print("+" if summed > 0 else "-")