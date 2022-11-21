import sys
sys.stdin = open("input.txt", "rt")

n = int(input())
bricks = []
for i in range(n):
    a, b, c = map(int,input().split())
    bricks.append((a,b,c))
bricks.sort(reverse=True)

dp = [0] * n
dp[0] = bricks[0][1]

res = bricks[0][1]

for i in range(1,n):
    max_h = 0
    for j in range(i-1,-1,-1):
        if bricks[j][2] > bricks[i][2] and dp[j] > max_h:
            max_h = dp[j]
        dp[i] = max_h + bricks[i][1]
        res = max(res,dp[i])

print(res)

# 밑면의 넓이가 더 넓어야 하기 때문에 넓이를 기준으로 내림차순 정렬하기.
