x = int(input())
line = 1

while x > line:
    x -= line 
    line += 1

up, down = 0, 0

if line % 2 == 1:
    up = line - x + 1
    down = x
else:
    up = x 
    down = line - x + 1
print(f'{up}/{down}')