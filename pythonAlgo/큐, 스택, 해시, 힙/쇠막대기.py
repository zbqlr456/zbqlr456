stick = list(map(str,input()))

stack = []
result = 0
for s in stick:
    if s == '(':
        stack.append(s)
    else:
        stack.pop()
        if stack[-1] == '(':
            result += len(stack)
        else:
            result += 1
print(result)


