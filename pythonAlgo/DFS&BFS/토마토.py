import sys
from collections import deque

m, n= map(int,input().split())
g = [[] for _ in range(n)]
di = [-1,1,0,0]
dj = [0,0,-1,1]

for i in range(n):
    g[i] = list(map(int,input().split()))
check = [[0]*m for _ in range(n)]

dq = deque()
res = 0
flag = 0
for i in range(n):
    for j in range(m):
        if g[i][j] == 1:
            dq.append((i,j,0))
            check[i][j] = 1
        if g[i][j] == 0:
            flag = 1
while dq:
    now = dq.popleft()
    for d in range(4):
        nexti = now[0] + di[d]
        nextj = now[1] + dj[d]
        if 0 <= nexti < n and 0 <= nextj < m and check[nexti][nextj] == 0 and g[nexti][nextj] != -1:
            if g[nexti][nextj] == 0:
                g[nexti][nextj] = 1
                check[nexti][nextj] = 1
                dq.append((nexti,nextj,now[2]+1))
                res = now[2]+1
for i in range(n):
    for j in range(m):
        if g[i][j] == 0:
            print(-1)
            sys.exit(0)
if flag == 0:
    print(0)
else:
    print(res)
