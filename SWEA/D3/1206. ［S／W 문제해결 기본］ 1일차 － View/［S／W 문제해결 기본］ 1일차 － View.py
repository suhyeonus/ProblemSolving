for test_case in range(1, 11):
    answer = 0
    N = int(input())
    buildings = list(map(int, input().split()))
    
    for i in range(2, N-2):
        left = max(buildings[i-2], buildings[i-1])
        right = max(buildings[i+1], buildings[i+2])
        highest = max(left, right)
        if highest < buildings[i]:
            answer += buildings[i] - highest
        #print(left, right, end = ' ')
    print(f"#{test_case} {answer}")