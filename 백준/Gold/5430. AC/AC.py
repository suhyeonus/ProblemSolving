from collections import deque
import sys 
input = sys.stdin.readline 

# 테스트케이스
for _ in range(int(input())):

    # p: 명령함수 n: 배열 길이, x: 배열 +예외처리
    p = input().rstrip()
    n = int(input())
    x = deque(input().rstrip()[1:-1].split(","))
    if n == 0: x = []

    is_reversed, is_error = False, False 
    for i in p:
        if i == 'R':
            is_reversed = not is_reversed
        else:
            if not x or len(x) < 1:
                is_error = True
                print("error")
                break 
            else:
                x.pop() if is_reversed else x.popleft()
    if not is_error:
        if is_reversed:
            print('[' + ','.join(list(x)[::-1]) + ']') 
        else: print('[' + ','.join(list(x)) + ']')               