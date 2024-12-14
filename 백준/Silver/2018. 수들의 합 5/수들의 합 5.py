import sys 
input = sys.stdin.readline 

n = int(input())
ans, summed = 0, 0
start, end = 0, 0

while end <= n:
    if summed == n:
        ans += 1
        end += 1
        summed += end
    elif summed < n:
        end += 1
        summed += end 
    else:
        summed -= start
        start += 1

print(ans)