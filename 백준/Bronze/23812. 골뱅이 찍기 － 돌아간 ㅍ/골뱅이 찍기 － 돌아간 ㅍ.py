def draw(n, m):
    for i in range(n):
        print('@' * n, end='')
        print(' ' * 3*n, end='')
        print('@' * n)

    if m == 2: return 
    
    for i in range(n):
        print('@' * 5*n)

n = int(input())
for i in range(3):
    draw(n, i)