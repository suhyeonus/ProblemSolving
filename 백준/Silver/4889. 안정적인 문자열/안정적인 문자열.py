import sys 
input = sys.stdin.readline 
idx = 0

while True:
    data = list(input().strip())
    if '-' in data: exit(0)

    fst = []
    ans = 0

    # for i in data:
    #     if not fst: fst.append(i)
    #     elif i == '}':
    #         if fst[-1] == '{':
    #             fst.pop()
    #         else:
    #             fst.append(i)
    #     else:
    #         fst.append(i)

    for i in data:
        if i == '{':
            fst.append(i)
        elif i == '}':
            if fst:
                fst.pop()
            else:
                ans += 1
                fst.append(i)

    ans += len(fst) // 2
    idx += 1
    print(f"{idx}. {ans}")
