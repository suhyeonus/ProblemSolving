n = int(input())
for i in range(1, n+1):
    str1 = input().rstrip()
    str2 = input().rstrip()
    
    alphabet = [0] * 26
    for j in str2:
        alphabet[ord(j) - ord('A')] += 1
    
    max_val = -1
    for j in str1:
        max_val = max(alphabet[ord(j) - ord('A')], max_val)
    print(f'#{i} {max_val}')