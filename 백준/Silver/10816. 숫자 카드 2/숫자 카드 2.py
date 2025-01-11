import sys 
input = sys.stdin.readline 

plus, minus = [0] * 10000001, [0] * 10000001

n = int(input())
card = list(map(int, input().split()))
m = int(input())
isExist = list(map(int, input().split()))

for i in card:
    if i < 0: minus[i] += 1
    else: plus[i] += 1

for i in isExist:
    print(minus[i], end=' ') if i < 0 else print(plus[i], end=' ')