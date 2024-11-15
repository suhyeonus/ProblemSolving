K=int(input())

def hanoi(n, start, middle, end):
  if n==1:
    print(f"{start} {end}")
  else:
    hanoi(n-1, start, end, middle)
    hanoi(1, start, middle, end)
    hanoi(n-1, middle, start, end)

move=(2**K)-1
print(move)
if K<=20:
  hanoi(K,"1","2","3")
else:
  pass