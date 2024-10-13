import sys 
input = sys.stdin.readline 

idx = 1 
while True:
    rwl = list(map(int, input().split()))
    if rwl[0] == 0: exit(0)

    pizza = (rwl[1]**2 + rwl[2]**2)**0.5
    if 2*rwl[0] >= pizza:
        print(f"Pizza {idx} fits on the table.")
    else:
        print(f"Pizza {idx} does not fit on the table.")
    idx += 1