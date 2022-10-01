import sys
sys.stdin = open("input.txt","rt")

# def digit_sum(x):
#     sumD = 0
#     while x>0:
#         sumD += x % 10
#         x //= 10
#     return sumD
#
# n = input()
# l = list(map(int,input().split()))
# k = 0
# result = 0
# for i in range(len(l)):
#     tmp = digit_sum(l[i])
#     if k < tmp:
#         k = tmp
#         result = l[i]
#
# print(result)

# 풀이
n = input()
a = list(map(int,input().split()))

def digit_sum(x):
    sumd = 0
    for i in str(x):
        sumd+=int(i)
    return sumd

maxl = -2147000000
for x in a:
    tot = digit_sum(x)
    if tot > maxl:
        maxl = tot
        res = x
print(res)