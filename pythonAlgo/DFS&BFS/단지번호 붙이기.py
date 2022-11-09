import sys
from collections import deque

n = int(input())
g = [list(map(int,input())) for _ in range(n)]
check = [[0]*n for _ in range(n)]
res = []
di = [-1,1,0,0]
dj = [0,0,-1,1]


dq = deque()

for i in range(n):
    for j in range(n):
        if g[i][j] == 1 and check[i][j] == 0:
            cnt = 1
            dq.append((i,j))
            check[i][j] = 1
            while dq:
                now = dq.popleft()
                nowi = now[0]
                nowj = now[1]
                for d in range(4):
                    nexti = nowi + di[d]
                    nextj = nowj + dj[d]
                    if 0 <= nexti < n and 0 <= nextj < n and check[nexti][nextj] == 0:
                        if g[nexti][nextj] == 1:
                            dq.append((nexti,nextj))
                            cnt += 1
                            check[nexti][nextj] = 1
            res.append(cnt)
res.sort()
print(len(res))
for x in res:
    print(x)