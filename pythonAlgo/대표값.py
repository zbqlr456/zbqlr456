import math
# N = int(input())
# a = list(map(int,input().split()))
# avg = math.ceil((sum(a)/N))
# result = 1e9
# num = 0
# for student, score in enumerate(a):
#     if abs(avg - score) < abs(avg - result):
#         result = score
#         num = student+1
#     elif abs(avg - score) == abs(avg - result):
#         if score > result:
#             result = score
#             num = student+1
# print("%d %d" %(avg, num))

# 풀이
n = int(input())
a = list(map(int, input().split()))
ave = round(sum(a)/n + 0.5)
min = 2147000000
for idx,x in enumerate(a):
    tmp = abs(x-ave)
    if tmp<min:
        min = tmp
        score = x
        res = idx + 1
    elif tmp == min:
        if x > score:
            score = x
            res = idx + 1
print(ave, res)
