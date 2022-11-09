import sys
from collections import deque
sys.stdin = open("input.txt", "rt")

n = int(input())
g = [[] for _ in range(n)]
di = [-1,1,0,0]
dj = [0,0,-1,1]

deepest = 0
for i in range(n):
    g[i] = list(map(int,input().split()))
    tmp = max(g[i])
    if tmp > deepest:
        deepest = tmp

res = 0
for k in range(1,deepest):
    cnt = 0
    dq = deque()
    check = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if g[i][j] > k and check[i][j] == 0:
                dq.append((i,j))
                check[i][j] = 1
                while dq:
                    now = dq.popleft()
                    nowi = now[0]
                    nowj = now[1]
                    for d in range(4):
                        nexti = nowi + di[d]
                        nextj = nowj + dj[d]
                        if 0 <= nexti < n and 0 <= nextj < n and check[nexti][nextj] == 0 and g[nexti][nextj] > k:
                            dq.append((nexti,nextj))
                            check[nexti][nextj] = 1
                cnt += 1
    if cnt > res:
        res = cnt
    # res = max(res, cnt) 로 쓰는게 더 깔끔할 듯

print(res)