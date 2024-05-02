# 단어 정렬 / 실버5 /
# https://www.acmicpc.net/problem/1181

word = []
for _ in range(int(input())):
    A = input().strip()
    if A not in word:
        word.append(A)


word.sort()
word.sort(key=len)
print(*word, sep="\n")