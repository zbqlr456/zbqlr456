n = int(input())
l = list(map(int, input().split()))

sumScore = 0
cnt = 0

for x in l:
    if x == 1:
        cnt += 1
        sumScore += cnt
    else:
        cnt = 0

print(sumScore)
