import sys 
input = sys.stdin.readline 

for _ in range(int(input())):
    m, n = input().rstrip().split()

    if m == '1':
        binStr = '0b'
        for i in n.split('.'): binStr += bin(int(i))[2:].zfill(8)
        print(int(binStr, 2))
        
    else:
        decStr = ''
        for i in range(0, 64, 8):
            decStr += str(int(bin(int(n))[2:].zfill(64)[i:i+8], 2))
            if i != 56: decStr += '.'
        print(decStr)