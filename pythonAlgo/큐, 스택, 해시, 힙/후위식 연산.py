import sys

sys.stdin = open("input.txt", "rt")

s = input()
stack = []

for i in range(len(s)):
    if s[i].isdecimal():
        stack.append(int(s[i]))
    else:
        a = stack.pop()
        b = stack.pop()
        if s[i] == '+':
            stack.append(b+a)
        elif s[i] == '-':
            stack.append(b-a)
        elif s[i] == '*':
            stack.append(b*a)
        elif s[i] == '/':
            stack.append(b/a)
print(stack.pop())