import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a_point, b_point = 0, 0
ans = []
while a_point < n or b_point < m:
    if a_point == n:
        ans.append(b[b_point])
        b_point += 1
    elif b_point == m:
        ans.append(a[a_point])
        a_point += 1
    else:
        if a[a_point] < b[b_point]:
            ans.append(a[a_point])
            a_point += 1
        else:
            ans.append(b[b_point])
            b_point += 1

print(*ans)