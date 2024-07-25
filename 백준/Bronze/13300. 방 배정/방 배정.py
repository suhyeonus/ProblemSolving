import math

male, female = [0 for _ in range(7)], [0 for _ in range(7)]
n, k = map(int, input().split())
for _ in range(n):
    gender, grade = map(int, input().split())
    if gender == 0: female[grade] += 1
    else: male[grade] += 1

ans = 0
for i in range(1, 7):
    ans += math.ceil(male[i] / k)
    ans += math.ceil(female[i] / k)
print(ans)