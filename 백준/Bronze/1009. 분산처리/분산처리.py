import sys 
input = sys.stdin.readline 

for i in range(int(input())):
    a, b = map(int, input().split())
    a %= 10

    if a == 0: print(10)
    elif a == 1 or a == 5 or a == 6: print(a)
    elif a == 4 or a == 9:
        print(a) if b%2 == 1 else print((a*a)%10)
    else:
        b %= 4
        print((a**4)%10%10%10) if b == 0 else print((a**b)%10%10%10)