import sys
from collections import deque

a = [[] for _ in range(7)]

di = [0,0,-1,1]
dj = [-1,1,0,0]

for i in range(7):
    a[i] = list(map(int,input().split()))

check = [[0]*7 for _ in range(7)]

dq = deque()
dq.append((0,0,0))
cnt = 0

while dq:
    now = dq.popleft()

    if now[0] == 6 and now[1] == 6:
        print(now[2])
        sys.exit(0)

    check[now[0]][now[1]] = 1

    for d in range(4):
        nexti = now[0] + di[d]
        nextj = now[1] + dj[d]
        if 0 <= nexti < 7 and 0 <= nextj < 7 and check[nexti][nextj] == 0:
            if a[nexti][nextj] == 0:
                dq.append((nexti,nextj,now[2]+1))

print(-1)