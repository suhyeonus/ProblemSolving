# [BOJ] 균형잡힌 세상 / 실버4 /
# https://www.acmicpc.net/problem/4949

bracketList = ['(', ')', '[', ']']
bracketFront = ['(', '[']

while True:
    bracket = ""
    S = input()

    # .가 입력으로 들어올 시 입력 종료
    if S == ".":
        break

    # 문자열 내의 괄호만 저장하기
    for i in S:
        if i in bracketList:
            if len(bracket) > 0 and bracket[-1] in bracketFront:
                if (bracket[-1] == '(' and i == ')') or (bracket[-1] == '[' and i == ']'):
                    bracket = bracket[:-1]
                else:
                    bracket += i
            else:
                bracket += i

    print("yes") if len(bracket) == 0 else print("no")