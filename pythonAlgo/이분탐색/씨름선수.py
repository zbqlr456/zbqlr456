import sys
sys.stdin = open("input.txt", "rt")
#
# n = int(input())
#
# men = []
#
# for i in range(n):
#     h, w = map(int, input().split())
#     men.append((h,w))
#
# men.sort()
#
# cnt = 1
#
# for i in range(n-1):
#     for j in range(i,n):
#        if men[i][1] < men[j][1]:
#             break
#     else:
#         cnt += 1
#
# print(cnt) # 이중 for문 돌게 됨

# 풀이
n = int(input())

body = []

for i in range(n):
    a, b = map(int, input().split())
    body.append((a, b))

body.sort(reverse=True) # 키순으로 내림차순하면 몸무게 살피면서 최대값만 찾으면 됨

largest = 0
cnt = 0

# 몸무게만 최대값을 구하면 for문 하나로 끝낼 수 있음
for x, y in body:
    if y > largest:
        largest = y
        cnt += 1
print(cnt)


