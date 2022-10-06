# import sys, re
#
# sys.stdin = open("input.txt", "rt")
#  정규표현식
# string = input()
#
# num = int(re.sub(r'\D','',string))
#
# cnt = 2
# for i in range(2,num):
#     if num % i == 0:
#         cnt += 1
#
# print("%d\n%d" %(num, cnt))

# 풀이
s = input()
res = 0
for x in s:
    if x.isdecimal():
        res = res * 10 + int(x)
print(res)
cnt = 0
for i in range(1, res + 1):
    if res % i == 0:
        cnt += 1
print(cnt)