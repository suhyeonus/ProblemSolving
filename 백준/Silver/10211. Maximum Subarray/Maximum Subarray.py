import sys 
input = sys.stdin.readline 

for TestCase in range(int(input())):
    N = int(input())
    X = list(map(int, input().split()))

    for i in range(1, N):
        X[i] = max(X[i], X[i-1]+X[i])

    print(max(X)) 