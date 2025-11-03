a = input().rstrip()
b = input().rstrip()

phone = ''
for i in range(16):
    if i%2 == 0: phone += a[i//2]
    else: phone += b[i//2]

while len(phone) > 2:
    tmp = ''
    for i in range(len(phone)-1): tmp += str((int(phone[i]) + int(phone[i+1])) % 10)
    phone = tmp 

print(phone)