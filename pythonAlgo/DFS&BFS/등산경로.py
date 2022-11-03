import sys
di = [-1, 1, 0, 0]
dj = [0, 0, -1, 1]
def DFS(x,y):
    global cnt

    if x == end[0] and y == end[1]:
        cnt += 1

    else:
        for d in range(4):
            nexti = x + di[d]
            nextj = y + dj[d]
            if 0 <= nexti < n and 0 <= nextj < n and g[nexti][nextj] > g[x][y]:
                DFS(nexti,nextj)

if __name__ == "__main__":
    n = int(input())
    g = [[] for _ in range(n)]

    for i in range(n):
        g[i] = list(map(int,input().split()))

    start = [0,0,1e9]
    end = [0,0,-1e9]

    for i in range(n):
        for j in range(n):
            if g[i][j] < start[2]:
                start[0] = i
                start[1] = j
                start[2] = g[i][j]
            if g[i][j] > end[2]:
                end[0] = i
                end[1] = j
                end[2] = g[i][j]
    cnt = 0

    DFS(start[0],start[1])

    print(cnt)

