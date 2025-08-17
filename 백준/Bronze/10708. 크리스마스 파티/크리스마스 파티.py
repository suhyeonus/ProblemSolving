n = int(input())
m = int(input())
target = list(map(int, input().split()))

answer = [0] * n 
for i in range(m):
    now_target = target[i]
    is_incorrect = 0
    
    guess = list(map(int, input().split()))
    for j in range(n):
        if guess[j] == now_target:
            answer[j] += 1 
        else:
            is_incorrect += 1
    answer[now_target-1] += is_incorrect

print("\n".join(map(str, answer)))