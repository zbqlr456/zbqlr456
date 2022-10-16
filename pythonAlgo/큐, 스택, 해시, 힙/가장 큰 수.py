import sys

sys.stdin = open("input.txt", "rt")

# n, m = map(int,input().split())

# stack1 = []
# stack2 = []
# tmp = 0
#
# while n > 0:
#     stack1.append(n % 10)
#     n //= 10
#
# cnt = 0
# while True:
#     if cnt == m or not stack1:
#         stack1.reverse()
#         stack2 += stack1
#         break
#     tmp = stack1.pop()
#     if not stack2:
#         stack2.append(tmp)
#     else:
#         while True:
#             if not stack2 or stack2[-1] >= tmp or cnt == m:
#                 stack2.append(tmp)
#                 break
#             else:
#                 stack2.pop()
#                 cnt += 1
#
# for _ in range(m - cnt):
#     stack2.pop()
#
# for x in stack2:
#     print(x,end='')

# 풀이

number, m = map(int,input().split())
number = list(map(int,str(number)))

stack = []

for x in number:
    while stack and m > 0 and stack[-1]  < x:
        stack.pop()
        m -= 1
    stack.append(x)
if m != 0:
    stack = stack[:-m] # -m인덱스만큼 잘라버린다.

res = ''.join(map(str,stack))
print(res)