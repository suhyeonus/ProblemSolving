n = int(input())

for _ in range(n):
    print('@' * (3 * n), end='')
    print(' ' * n, end='')
    print('@' * n)

for _ in range(3 * n):
    print('@' * n, end='')
    print(' ' * n, end='')
    print('@' * n, end='')
    print(' ' * n, end='')
    print('@' * n)

for _ in range(n):
    print('@' * n, end='')
    print(' ' * n, end='')
    print('@' * (3 * n))