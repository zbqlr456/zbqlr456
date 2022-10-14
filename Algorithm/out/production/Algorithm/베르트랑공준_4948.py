import math

list = [0 for i in range(250001)]
bool_list = [False for i in range(250001)]

for i in range(2, int(math.sqrt(250000)) + 1):
    if list[i] == 0:
        bool_list[i] = True
        for j in range(1, int(250000 / i) + 1):
            list[i * j] = i * j

while True:
    cnt = 0
    a = int(input())

    if a == 0:
        break

    if a == 1:
        print(1)
        continue

    for i in range(a+1,2*a+1):
        if bool_list[i] or list[i] == 0:
            cnt+=1

    print(cnt)