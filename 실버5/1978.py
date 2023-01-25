# [1978] 소수 찾기 / 실버5 / 15분

N = int(input())
count = N
numbers = map(int, input().split())

for i in numbers:
    if i == 1:
        count -= 1
    for j in range(2, i):
        if i % j == 0:
            count -= 1
            break

print(count)

