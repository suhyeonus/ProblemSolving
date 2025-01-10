import sys 
input = sys.stdin.readline 

n = int(input())
card = set(map(int, input().split()))
m = int(input())
isExist = list(map(int, input().split()))

for i in isExist:
    print(1, end=' ') if i in card else print(0, end=' ') 