import sys 
input = sys.stdin.readline 

n = int(input())
a = sorted([int(input()) for _ in range(n)])

ans = 4
for i in range(n):
    start, end = i, n - 1
    while start < end:
        if a[end] - a[start] > 4:
            end -= 1
        else:
            ans = min(ans, 4-(end-start))
            break

print(ans)