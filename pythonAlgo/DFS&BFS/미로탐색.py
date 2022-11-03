import sys
sys.stdin = open("input.txt", "rt")
di = [-1, 1, 0, 0]
dj = [0, 0, -1, 1]
def DFS(x,y):
    global cnt

    if x == 6 and y == 6:
        cnt += 1

    else:
        for d in range(4):
            nexti = x + di[d]
            nextj = y + dj[d]
            if 0 <= nexti < 7 and 0 <= nextj < 7 and g[nexti][nextj] == 0:
                g[nexti][nextj] = 1
                DFS(nexti,nextj)
                g[nexti][nextj] = 0

if __name__ == "__main__":
    g = [[] for _ in range(7)]

    for i in range(7):
        g[i] = list(map(int,input().split()))

    cnt = 0
    g[0][0] = 1
    DFS(0,0)

    print(cnt)

