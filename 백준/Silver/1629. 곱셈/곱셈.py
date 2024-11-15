import sys 
input = sys.stdin.readline 

a, b, c = map(int, input().split())

def multi(x, y, z):
    if y == 0: return 0
    elif y == 1: return x % z

    tmp = multi(x, y//2, z)
    tmp = (tmp * tmp) % z
    return tmp * x % z if y % 2 else tmp

print(multi(a,b,c))