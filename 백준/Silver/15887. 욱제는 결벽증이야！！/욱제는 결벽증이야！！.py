import sys 
input = sys.stdin.readline 

N = int(input())
card = list(map(int, input().split()))
card_copied = card.copy()
card_copied.sort()

op, i = 0, 1
changed = []

while card != card_copied:
    if card[i-1] != i:
        op += 1 
        ind = card.index(i) + 1
        card[i-1:ind] = card[i-1:ind][::-1]
        changed.append((i, ind))
    i += 1

print(len(changed))
for i in changed: print(*i)