import sys 
input = sys.stdin.readline 

N = int(input())
stdt = []
for i in range(N):
    stdt.append(input().rstrip().split())

stdt.sort(key=lambda x:(-int(x[1]), int(x[2]), -int(x[3]), x[0]))
for i in stdt:
    print(i[0])