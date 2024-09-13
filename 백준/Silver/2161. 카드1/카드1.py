from collections import deque 

card = deque(range(1, int(input()) + 1))
thrw = []

while card:
    thrw.append(card.popleft())
    if len(card) <= 1: break
    card.append(card.popleft())

print(*thrw, *card)