n, m = map(int, input().split())
print(f"SN {n}", end='')

if m <= 26: 
    print(chr(m+64))
else: 
    m -= 27
    print(f"{chr(m//26+97)}{chr(m%26+97)}")