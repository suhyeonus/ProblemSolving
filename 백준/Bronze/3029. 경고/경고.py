import sys 
input = sys.stdin.readline 

nowtime = input().rstrip()
natime = input().rstrip()

if nowtime == natime:
    print("24:00:00")
    exit(0)

nowh, nowm, nows = map(int, nowtime.split(":"))
nah, nam, nas = map(int, natime.split(":"))

if nas < nows:
    nas += 60
    nam -= 1

if nam < nowm: 
    nam += 60
    nah -= 1

if nah < nowh:
    nah += 24 

ansh = str(nah - nowh) if nah - nowh >= 10 else '0' + str(nah - nowh)
ansm = str(nam - nowm) if nam - nowm >= 10 else '0' + str(nam - nowm)
anss = str(nas - nows) if nas - nows >= 10 else '0' + str(nas - nows)

print(f"{ansh}:{ansm}:{anss}")