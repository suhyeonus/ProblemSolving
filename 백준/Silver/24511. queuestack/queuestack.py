from collections import deque 
import sys 
input = sys.stdin.readline 

N = int(input())
form = list(map(int, input().split()))
elem = list(map(int, input().split()))
M = int(input())
toap = list(map(int, input().split()))
ans = deque()

# 시간 초과
# for i in toap:
#     tmp = i
#     for j in range(N):
#         if form[j] == 0:
#             tmp, elem[j] = elem[j], tmp
#     ans.append(tmp) 
# print(*ans)

for q in range(N):
    if not form[q]:
        ans.appendleft(elem[q])

for i in range(M):
    ans.append(toap[i])

print(*list(ans)[:M])