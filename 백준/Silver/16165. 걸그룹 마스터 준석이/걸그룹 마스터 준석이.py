import sys 
input = sys.stdin.readline 

N, M = map(int,input().split())
group = {}

# 걸그룹 입력받기
for _ in range(N):
    gname = input().strip()
    member = []
    for _ in range(int(input())):
        member.append(input().strip())
    member.sort()
    group[gname] = member

# 퀴즈 입력받기
for _ in range(M):
    quiz = input().strip()
    qtype = int(input())
    if qtype:
        for i in group.items():
            if quiz in i[1]: print(i[0])
    else: print(*group[quiz], sep='\n')
