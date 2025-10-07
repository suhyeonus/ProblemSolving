def answer(cnt):
    if cnt == 4: return 'love'
    return 'hate'

l = input().rstrip()
cnt = 0

for i in l:
    if cnt == 0 and i == 'U': cnt = 1 
    elif (cnt == 1 or cnt == 3) and i == 'C': cnt += 1
    elif cnt == 2 and i == 'P': cnt = 3 

print(f"I {answer(cnt)} UCPC")