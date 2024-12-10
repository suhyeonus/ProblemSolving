import sys 
input = sys.stdin.readline 

word = input().rstrip()
ans = []

for i in range(len(word)):
    for j in range(i+1, len(word)):
        a = word[:i+1]
        b = word[i+1:j+1]
        c = word[j+1:]
        if a and b and c:
            tmp = a[::-1] + b[::-1] + c[::-1]
            if tmp not in ans: ans.append(tmp)

ans.sort()
print(ans[0])