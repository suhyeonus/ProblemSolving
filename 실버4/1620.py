# [1620] 나는야 포켓몬 마스터 이다솜 / 실버4 / 20분

import sys
input = sys.stdin.readline

n, m = map(int, input().split())
pkm = {}
for i in range(1, n + 1):
    name = input().strip()
    pkm[i] = name
    pkm[name] = i

for _ in range(m):
    tmp = input().strip()
    # 입력이 숫자일 때
    if(tmp.isdigit()):
        print(pkm[int(tmp)])
    # 입력이 이름일 때
    else:
        print(pkm[tmp])
