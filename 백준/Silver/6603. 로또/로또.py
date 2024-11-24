import sys 
input = sys.stdin.readline 

def backTracking(idx):
    if len(ans) == 6:
        print(*ans)
        return
    for i in range(idx, k+1):
        if lottery[i] not in ans:
            ans.append(lottery[i])
            backTracking(i+1)
            ans.pop()

while True:
    lottery = list(map(int, input().split()))
    k = lottery[0]
    if not k: exit(0)

    ans = []
    backTracking(1)
    print()