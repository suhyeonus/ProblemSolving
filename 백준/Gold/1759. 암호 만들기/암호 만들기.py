import sys 
input = sys.stdin.readline 

l, c = map(int, input().split())
alphabet = list(input().rstrip().split())
alphabet.sort()
ans = []

vowel = ['a', 'e', 'i', 'o', 'u']
def backTracking(idx):
    if len(ans) == l:
        is_vowel, is_consonant = 0, 0
        for cha in ans:
            if cha in vowel: is_vowel += 1
            else: is_consonant += 1

        if is_vowel and is_consonant >= 2:
            print(*ans, sep='')
        return
     
    for i in range(idx, c):
        if alphabet[i] not in ans:
            ans.append(alphabet[i])
            backTracking(i+1)
            ans.pop()

backTracking(0)
