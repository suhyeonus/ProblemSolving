import sys 
input = sys.stdin.readline 

L = input().rstrip()
S = input().rstrip()
splited = L.split(S) 

print(len(splited)-1)