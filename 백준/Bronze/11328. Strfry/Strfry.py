def compare(aa, bb):
    for i in range(26):
        if aa[i] != bb[i]: return("Impossible")
    return("Possible")

for _ in range(int(input())):
    a, b = input().strip().split()
    aa, bb = [0] * 26, [0] * 26
    for i in a: aa[ord(i)-97] += 1
    for i in b: bb[ord(i)-97] += 1
    print(compare(aa,bb))
