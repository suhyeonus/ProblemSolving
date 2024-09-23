import sys 
input = sys.stdin.readline 

seat = [['.' for _ in range(20)] for _ in range(10)]

for _ in range(int(input())):
    ticket = input().strip()
    seat[ord(ticket[0])-65][int(ticket[1:])-1] = 'o'

for i in seat:
    print(*i, sep='')