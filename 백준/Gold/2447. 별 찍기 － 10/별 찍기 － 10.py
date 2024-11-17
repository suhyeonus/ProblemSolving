n = int(input()) 

def sol(k):
    if k == 1:
        return ['*']
    created_star = []
    for s in sol(k//3):
        created_star.append(s * 3)
    for s in sol(k//3):
        created_star.append(s + ' ' * (k//3) + s)
    for s in sol(k//3):
        created_star.append(s * 3)

    return created_star

print(*sol(n), sep='\n')
