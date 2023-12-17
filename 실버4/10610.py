# [10610] 30 / 실버4 / 인터넷 참고
# 3의 배수의 특징 = 자릿수의 숫자를 모두 더하면 3의 배수

n = input()
if '0' not in n:
    print(-1)
else:
    sum = 0
    n = sorted(n, reverse=True)
    for i in n:
        sum += int(i)
    if sum % 3 != 0:
        print(-1)
    else:
        print(*n, sep="")
