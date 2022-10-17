n = int(input())

dic = {}
for i in range(n):
    dic[input()] = 1
for i in range(n-1):
    dic[input()] -= 1
for key,vel in dic.items():
    if vel == 1:
        print(key)
        break