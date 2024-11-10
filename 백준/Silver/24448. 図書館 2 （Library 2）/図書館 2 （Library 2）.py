import sys 
input = sys.stdin.readline 

q = []
for _ in range(int(input())):
    prompt = input().rstrip()
    print(q.pop()) if prompt == 'READ' else q.append(prompt)
        