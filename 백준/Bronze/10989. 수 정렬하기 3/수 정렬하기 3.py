import sys 
input = sys.stdin.readline
visit = [0] * 10001
for _ in range(int(input())):
    visit[int(input())] += 1

for i in range(10001):
    if visit[i]:
        for _ in range(visit[i]):
            print(i)