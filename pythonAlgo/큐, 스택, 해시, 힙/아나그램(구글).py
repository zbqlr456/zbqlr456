import sys

sys.stdin = open("input.txt", "rt")

# a = input()
# b = input()
# aDic = {}
# bDic = {}

# AbaAeCe
# baeeACA
# for i in range(len(a)):
#     if a[i] in aDic:
#         aDic[a[i]] += 1
#     else:
#         aDic[a[i]] = 1
#
# for x in b: # 위의 for문과 같은 기능!
#     bDic[x] = bDic.get(x, 0) + 1
#
# for aKey in aDic.keys():
#     if aKey in bDic.keys():
#         if aDic[aKey] != bDic[aKey]: # 두 key의 갯수가 다르면
#             print("NO")
#             break
#         else:
#             print("NO")
#             break
# else:
#     print("YES")

# 개선 코드

a = input()
b = input()
dic = {}
for x in a:
    dic[x] = dic.get(x, 0) + 1
for x in b:
    dic[x] = dic.get(x, 0) - 1
# 이렇게 하면 dictionary의 value값이 전부 0이 되어야 함.

for x in a:
    if dic.get(x) > 0:
        print("NO")
        break
else:
    print("YES")