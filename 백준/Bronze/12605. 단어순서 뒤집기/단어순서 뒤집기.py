import sys 
input = sys.stdin.readline 

for i in range(int(input())):
    case = list(input().strip().split())
    print(f"Case #{i+1}: ", end='')
    print(*case[::-1])