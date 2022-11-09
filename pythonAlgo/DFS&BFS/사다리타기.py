import sys

def DFS(x,y,start):

    di = [0,0,1]
    dj = [-1,1,0]
    flag = 0
    for d in range(3):
        nexti = x + di[d]
        nextj = y + dj[d]
        if 0 <= nexti < 10 and 0 <= nextj < 10 and check[nexti][nextj] == 0 and flag == 0:
            if g[nexti][nextj] == 2:
                print(start)
                sys.exit(0)
            if g[nexti][nextj] == 1:
                if d != 2:
                    flag = 1
                check[nexti][nextj] = 1
                DFS(nexti,nextj,start)

if __name__ == "__main__":
    g = [list(map(int,input().split())) for _ in range(10)]

    for j in range(10):
        if g[0][j] == 1:
            check = [[0] * 10 for _ in range(10)]
            check[0][j] = 1
            DFS(0,j,j)
