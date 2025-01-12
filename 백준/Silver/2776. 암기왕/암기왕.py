import sys 
input = sys.stdin.readline 

for TestCase in range(int(input())):
    n = int(input())
    note1 = list(map(int, input().split()))
    m = int(input())
    note2 = list(map(int, input().split()))

    noteSet = set(note1)
    for j in note2:
        print(1) if j in noteSet else print(0)