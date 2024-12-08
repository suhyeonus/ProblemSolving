import sys
input = sys.stdin.readline 

n = int(input())
k = int(input())
ans = 0

for i in range(1, n+1):
    # i == 1일 때도 조건 성립하므로 추가
    if i == 1: 
        ans += 1
    else:
        tmp = 2
        while i > 1:
            # 소인수분해 가능한 수가 k보다 클 경우 바로 break
            if tmp > k: break
            if not i % tmp:
                i //= tmp
            else: tmp += 1
        else: ans += 1

print(ans)