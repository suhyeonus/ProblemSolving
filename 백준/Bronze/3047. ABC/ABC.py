nums = sorted(list(map(int, input().split())))
for i in input().rstrip(): print(nums[ord(i)-65], end=' ')