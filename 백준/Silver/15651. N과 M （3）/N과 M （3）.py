n, m = map(int, input().split())
s = []

def backTracking():
    if len(s) == m:
        print(' '.join(map(str, s)))
        return 
    else:
        for i in range(1, n + 1):
            s.append(i)
            backTracking()
            s.pop()
backTracking()