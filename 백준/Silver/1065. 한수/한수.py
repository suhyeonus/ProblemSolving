N=int(input())

hansu=set()
for i in range (1,N+1):
  numlist=list(map(int,str(i)))
  if i>=100:
    if numlist[2]-numlist[1]==numlist[1]-numlist[0]:
      hansu.add(i)
  elif i<100:
    hansu.add(i)

print(len(hansu))