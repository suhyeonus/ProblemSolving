from collections import Counter 
import sys 
input = sys.stdin.readline 

word = input().rstrip().upper()
counter = Counter(word)
ans = counter.most_common(2)

if len(ans) == 1: print(ans[0][0])
else:
    if ans[0][1] == ans[1][1]: print("?")
    else: print(ans[0][0])