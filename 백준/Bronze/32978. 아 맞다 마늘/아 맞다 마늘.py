import sys 
input = sys.stdin.readline 

n = int(input())
used = list(input().rstrip().split())
ingr = list(input().rstrip().split())

for i in used:
    if i not in ingr: 
        print(i)
        break