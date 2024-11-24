n, m = map(int, input().split())
a = list(map(int, input().split()))
a.sort()
s = []

def bt():
    if len(s) == m:
        print(' '.join(map(str, s)))
        return 
    else:
        for i in a:
            if i not in s:
                s.append(i)
                bt()
                s.pop()
bt()