while True:
    n = int(input())
    if n == -1: break
    a = [i for i in range(1, n) if n % i == 0]
    print(f"{n} is NOT perfect.") if sum(a) != n else print((f"{n} = ")+" + ".join(map(str,a)))
