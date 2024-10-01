import sys 
input = sys.stdin.readline 

for _ in range(int(input())):
    i, n = input().strip().split()
    oct8 = int(n,8) if max(list(n)) < '8' else 0
    print(int(i), int(oct8), int(n), int(n,16))