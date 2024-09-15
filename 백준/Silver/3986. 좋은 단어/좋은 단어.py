from collections import deque 
import sys 
input = sys.stdin.readline 

n, ans = int(input()), 0
for _ in range(n):
    flag = True 
    word1 = list(input().strip())
    word2 = []
    if len(word1)%2 == 1: flag = False 
    else:
        for i in word1:
            if not word2:
                word2.append(i)
            elif word2[-1] == i:
                word2.pop()
            else: word2.append(i)
        if word2: flag = False 
    if flag: ans += 1
print(ans)