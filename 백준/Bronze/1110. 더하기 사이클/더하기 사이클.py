N= answer = int(input())
num=0
new=0
plus=0

while(1):
    plus=N//10 + N%10
    new=(plus%10)+(N%10)*10
    N=new
    num+=1
    
    if (answer==new):
        print(num)
        break