import sys 
input = sys.stdin.readline 

N = int(input())
dict = {}
for i in range(N):
    name, kor, eng, mat = input().rstrip().split()
    dict[name] = [int(kor), int(eng), int(mat)]

dict = sorted(dict.items(), key=lambda x:(-x[1][0], x[1][1], -x[1][2], x[0]))
for i in dict: 
    print(i[0]) 