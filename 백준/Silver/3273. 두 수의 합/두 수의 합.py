import sys 
input = sys.stdin.readline 

n = int(input())
a = list(map(int, input().split()))
x = int(input())

visit = [0] * 2000001
ans = 0

for i in a:
    if visit[x-i] == 1: ans += 1
    visit[i] = 1

print(ans)