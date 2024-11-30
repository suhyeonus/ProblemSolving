n = int(input())
tmp = 0

for i in range(666, 10000000):
    if '666' in str(i):
        tmp += 1
        if tmp == n:
            print(i)
            exit(0)