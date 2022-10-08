n = int(input())
graph = [list(map(int,input().split())) for _ in range(n)]
result = -1

for i in range(n):
    sum1 = sum2 = 0
    for j in range(n):
        sum1 += graph[i][j]
        sum2 += graph[j][i]
        if sum1 > result:
            result = sum1
        if sum2 > result:
            result = sum2
sum1 = sum2 = 0
for i in range(n):
    sum1 += graph[i][i]
    sum2 += graph[i][n-i-1]
    if sum1 > result:
        result = sum1
    if sum2 > result:
        result = sum2

print(result)