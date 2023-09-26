# [11444] 피보나치 수 6 / 골드2 / 20분

def matPower(x, y):
    answer = [[0, 0], [0, 0]]
    for i in range(2):
        for j in range(2):
            for k in range(2):
                answer[i][j] += x[i][k] * y[k][j]
                answer[i][j] %= 1000000007
    return answer

# Tip
# N이 매우 크면, n이 자연수라도 int(n/2)와 n//2가 달라질 수 있다
# 그러니 //을 쓰도록 하자.


def fibo6(x, n):
    answer = [[1, 1], [1, 0]]
    if n <= 1:
        return answer
    elif n % 2 == 0:
        tmp = fibo6(x, n / 2)
        return matPower(tmp, tmp)
    else:
        tmp = fibo6(x, (n - 1) / 2)
        return matPower(matPower(tmp, tmp), answer)

x = [[1, 1], [1, 0]]
N = int(input())
if N <= 1:
    print(N)
else:
    print(fibo6(x, N)[0][1])
