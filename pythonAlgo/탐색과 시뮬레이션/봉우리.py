import sys
sys.stdin = open("input.txt", "rt")

n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]
di = [-1,1,0,0]
dj = [0,0,-1,1]
res = 0
for i in range(0,n):
    for j in range(0,n):
        cnt = 0
        for d in range(4):
            if i + di[d] < 0 or i + di[d] >= n or j + dj[d] < 0 or j + dj[d] >= n:
                cnt += 1
                continue
            if graph[i+di[d]][j+dj[d]] < graph[i][j]:
                cnt += 1
        if cnt == 4:
            res += 1
print(res)

#풀이
# 아래와 같은 코드로 바깥에 0을 깔면 방향돌릴 때 continue를 안해도 된다.
# graph.insert(0, [0] * n)
# graph.append([0] * n)
# for x in graph:
#     x.insert(0,0)
#     x.append(0)
cnt = 0
for i in range(1,n+1):
    for j in range(1,n+1):
        if all(graph[i][j]>graph[i+di[d][j+dj[d]]] for d in range(4)): # all은 모든 조건이 참이 되여야 한다는 뜻
            cnt += 1
print(cnt)