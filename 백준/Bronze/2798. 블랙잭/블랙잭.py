import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
card = list(map(int, input().split()))
card.sort()

arr = []
ans = 0

def sol(idx):
    global ans
    if len(arr) == 3:
        if ans < sum(arr) <= m:
            ans = sum(arr)
        return 
    for i in range(idx, n):
        if card[i] not in arr:
            arr.append(card[i])
            sol(i+1)
            arr.pop()

sol(0)
print(ans)
