import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
a = list(map(int, input().split()))

s, e = 0, 0
ans, plus = 0, a[0]

while True:
    if plus < m:
        e += 1
        if e >= n: 
            break 
        plus += a[e]
    else:
        if plus == m:
            ans += 1
        plus -= a[s]
        s += 1

print(ans) 