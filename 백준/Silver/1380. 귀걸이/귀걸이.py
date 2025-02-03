import sys 
input = sys.stdin.readline 

testCase = 1
while True:
    n = int(input())
    if not n: break 

    girls = []
    for _ in range(n):
        girls.append([input().rstrip(), [0, 0]])

    for _ in range(2*n - 1):
        index, alp = input().rstrip().split()
        if alp == 'A':
            girls[int(index)-1][1][0] = 1
        else:
            girls[int(index)-1][1][1] = 1

    for i in range(n):
        if sum(girls[i][1]) != 2:
            print(testCase, girls[i][0])
            break 

    testCase += 1