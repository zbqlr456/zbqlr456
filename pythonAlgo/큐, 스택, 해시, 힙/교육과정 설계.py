import sys
from collections import deque

sys.stdin = open("input.txt","rt")

# must = list(input())
# n = int(input())

# AKDEF
# WOPASFKGHDEF
# for i in range(n):
#     dq = deque(input())
#     cnt = 0
#     j = 0
#     while dq:
#         if dq.popleft() == must[j]:
#             j += 1
#             cnt += 1
#         if cnt >= len(must):
#             break
#     if cnt >= len(must):
#         print("#%d YES" %(i+1))
#     else:
#         print("#%d NO" %(i+1))
#  다른 과목이 먼저 나오면 틀리게 된다.

# 풀이

need = input()
n = int(input())
for i in range(n):
    plan = input()
    dq = deque(need)
    for x in plan:
        if x in dq:
            if x != dq.popleft():
                print("#%d NO" %(i+1))
                break
    else:
        if len(dq) == 0:
            print("#%d YES" %(i+1))
        else:
            print("#%d NO" % (i + 1))