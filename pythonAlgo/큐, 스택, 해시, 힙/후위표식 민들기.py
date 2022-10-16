# s = input()
# result = ''
# stack = []
# for i in range(len(s)):
#     if s[i].isdigit():
#         result += s[i]
#     elif s[i] == ')':
#         while True:
#             tmp = stack.pop()
#             if tmp == '(':
#                 break
#             else:
#                 result += tmp
#     elif stack and (s[i] == '*' or s[i] == '/') and (stack[-1] == '*' or stack[-1] == '/'):
#         result += stack.pop()
#         stack.append(s[i])
#     else:
#         stack.append(s[i])
# while stack:
#     result += stack.pop()
# print(result) # 우선순위 설정 안함

# 풀이

a = input()
stack = []
res = ''
for x in a:
    if x.isdecimal(): # 숫자면 그냥 결과에 담음
        res += x
    else:
        if x == '(': # 여는 괄호는 무조건 스택에 담음
            stack.append(x)
        elif x == '*' or x == '/': # 연산 우선순위 + - 보다 먼저
            while stack and (stack[-1] == '*' or stack[-1] == '/'):
                res += stack.pop()
            stack.append(x)
        elif x == '+' or x == '-':
            while stack and stack[-1] != '(': # 여는 괄호를 만나면 괄호안의 연산자이기 때문에 멈춤
                res += stack.pop()
            stack.append(x)
        elif x == ')':
            while stack and stack[-1] != '(':
                res += stack.pop()
            stack.pop() # 여는 괄호 제거
while stack:
    res += stack.pop()

print(res)