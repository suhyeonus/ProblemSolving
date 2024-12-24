import sys 
input = sys.stdin.readline 

engName = input().rstrip()
team = {}

for _ in range(int(input())):
    name = input().rstrip()
    L = engName.count('L') + name.count('L')
    O = engName.count('O') + name.count('O')
    V = engName.count('V') + name.count('V')
    E = engName.count('E') + name.count('E')
    team[name] = ((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100

team = sorted(team.items(), key=lambda x:(-x[1], x[0]))
print(team[0][0])