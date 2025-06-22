s = input().rstrip()
vowel = ['a', 'e', 'i', 'o', 'u']
i = 0

while i < len(s):
    print(s[i], end='')
    if s[i] in vowel:
        i += 2
    i += 1