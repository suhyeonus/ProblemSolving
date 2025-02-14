import sys 
input = sys.stdin.readline 

serials = {}
for _ in range(int(input())):
    sumOfDigits = 0
    number = input().rstrip()
    for i in number:
        if '0' <= i and i <= '9':
            sumOfDigits += int(i)
    serials[number] = sumOfDigits

serials = sorted(serials.items(), key=lambda x:(len(x[0]), x[1], x[0]))

for i in serials:
    print(i[0])