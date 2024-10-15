import sys 
input = sys.stdin.readline 

X, Y = input().rstrip().split()
print(int(str(int(X[::-1])+int(Y[::-1]))[::-1]))