import sys
import itertools as it
sys.stdin = open("input.txt", "rt")

n,m = map(int,input().split())
g = [list(map(int,input().split())) for _ in range(n)]
c = []
l = []
for i in range(n):
    for j in range(n): # 여기서 g[i][j] == 1일 경우도 같이 넣어줬으면 밑에서 다 안돌려도 됐을 듯
        if g[i][j] == 2:
            c.append((i,j))

l = list(it.combinations(c,m))

res = 1e9
for x in l:
    total = 0
    for i in range(n):
        for j in range(n):
            if g[i][j] == 1:
                shortest = 1e9
                for k in range(m):
                    shortest = min(abs(i-x[k][0]) + abs(j-x[k][1]),shortest)
                total += shortest
    res = min(total,res)
print(res)