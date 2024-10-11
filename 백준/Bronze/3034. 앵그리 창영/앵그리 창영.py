N, W, H = map(int, input().split())
for _ in range(N):
    length = int(input())
    print("DA") if length <= (W*W+H*H)**0.5 else print("NE")