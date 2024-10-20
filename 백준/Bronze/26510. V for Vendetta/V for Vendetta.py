a = list(map(int, input().split()))
for i in a:
    for j in range(i-1):
        print(" " * j, end='')
        print("*", end='')
        print(" " * (2*(i-j-1)-1), end='')
        print("*")
    print(" " * (i - 1), end='')
    print("*")
