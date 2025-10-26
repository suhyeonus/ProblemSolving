import sys 
input = sys.stdin.readline 

letters = [('000000', 'A'), ('001111', 'B'), ('010011', 'C'), ('011100', 'D'), 
          ('100110', 'E'), ('101001', 'F'), ('110101', 'G'), ('111010', 'H')]

ans = ''
n = int(input())
s = input().rstrip()

for i in range(0, n*6, 6):
    tmp = s[i:i+6]
    for l, alp in letters:
        diff = 0
        for j in range(6):
            if tmp[j] != l[j]: diff += 1
        if diff <= 1:
            ans += alp
            continue 
    if len(ans) < i//6+1:
        print(i//6+1)
        exit(0)

print(ans)