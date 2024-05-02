# 백준 1158: 요세푸스 문제 / 실버4
# 풀이 시간:
# 큐

# queue = 1 ~ N번까지의 원.
# 1 꼭 더해주기
N, K = map(int, input().split())
queue = [_ for _ in range(1, N + 1)]
answer = []
index = 0

for i in range(N):
    # 1을 빼주는 이유: 원소가 하나씩 삭제되기 때문에
    index += K - 1
    # 안 빼주면 out of range 발생
    if index >= len(queue):
        index %= len(queue)
    # answer에 해당 원소를 추가해주고, 그대로 pop
    answer.append(queue.pop(index))

print("<", end="")
print(', '.join(map(str, answer)) + '>')