from itertools import combinations
import sys 
input = sys.stdin.readline 

N, M = map(int, input().split())
arr = list(map(int, input().split()))
arr.sort()
ans = set()

for i in combinations(arr, M):
    if i not in ans:
        ans.add(i)
        print(*i)