from collections import deque 
import sys 
input = sys.stdin.readline 

n = int(input())
a = list(input().rstrip() for _ in range(n))

def lotate_word(x, y):
    if len(x) != len(y): return y
    y = deque(y)

    for i in range(len(y)):
        y.append(y.popleft())
        if ''.join(y) == x: return x 

    return ''.join(y)

for i in range(n):
    for j in range(i+1, n):
        if a[i] != a[j]:
            a[j] = lotate_word(a[i], a[j])

print(len(set(a)))