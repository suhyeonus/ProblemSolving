fact = [1] * 21 
for i in range(2, 21):
    fact[i] = i * fact[i-1]

n = int(input())
if not n: 
    print('NO')
    exit(0)
    
isValid = False
for i in range(20, -1, -1):
    if isValid: break 
        
    if n >= fact[i]:
        n -= fact[i]
    if n == 0: isValid = True

print('YES' if isValid else 'NO')