import sys
from collections import deque


n = int(input())
di = [-1,1,0,0]
dj = [0,0,-1,1]

graph = [[] for _ in range(n)]
check = [[0] * n for _ in range(n)]

for i in range(n):
    graph[i] = list(map(int,input().split()))

total = graph[n//2][n//2]

dq = deque()
dq.append((n//2,n//2))
check[n//2][n//2] = 1
L = 0
while True: # 트리 단계 별로 잘 그리는 것이 중요
    if L == n//2:
        break
    size = len(dq)

    for i in range(size):
        now = dq.popleft()

        for d in range(4):
            x = now[0] + di[d]
            y = now[1] + dj[d]

            if check[x][y] == 0:
                total += graph[x][y]
                check[x][y] = 1
                dq.append((x,y))
    L += 1
print(total)

