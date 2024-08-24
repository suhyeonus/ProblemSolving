a = input().strip()
b = input().strip()

a_alpha, b_alpha = [0] * 26, [0] * 26 

for i in a:
    a_alpha[ord(i)-97] += 1
for i in b:
    b_alpha[ord(i)-97] += 1

ans = 0
for i in range(26):
    ans += abs(a_alpha[i] - b_alpha[i])

print(ans)