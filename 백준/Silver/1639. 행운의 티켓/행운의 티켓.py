import sys 
input = sys.stdin.readline 

ticket = input().rstrip()
answer = 0

for i in range(len(ticket)):
    for j in range(i+1, len(ticket), 2):
        if sum(map(int, ticket[i : (i+j)//2 + 1])) == sum(map(int, ticket[(i+j)//2 + 1 : j+1])):
            answer = max(answer, len(ticket[i : j+1]))

print(answer)