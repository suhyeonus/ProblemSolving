a = list(map(int, input().split()))
answer = 0
for i in a: 
    if i > 0: answer += 1
print(answer)