import sys

sys.stdin = open("input.txt", "rt")
# n, m = map(int, input().split())
# l = [0] * (n + m + 1)
#
# for i in range(1, n + 1):
#     for j in range(1, m + 1):
#         l[i + j] += 1
#
# maxL = max(l)
# result = list()
# for i in range(len(l)):
#     if l[i] == maxL:
#         result.append(i)
# result.sort()
#
# for x in result:
#     print(x, end=" ")

# 풀이
n, m = map(int, input().split())
cnt = [0]*(n+m+3)
maxL = 0
for i in range(1,n+1):
    for j in range(1,m+1):
        cnt[i+j] += 1

for i in range(n+m+1):
    if cnt[i] > maxL:
        maxL = cnt[i]

for i in range(n+m+1):
    if cnt[i] == maxL:
        print(i,end = ' ')
# sort 할 필요없이 그냥 돌면서 출력하면 자동 오름차순