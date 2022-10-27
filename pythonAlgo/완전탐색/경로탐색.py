import sys

def DFS(L,start):
    global cnt
    if start == n:
        cnt += 1
    check[start] = 1
    for i in range(1,n+1):
        if start != i and check[i] != 1 and graph[start][i] == 1:
            check[i] = 1
            DFS(L+1,i)
            check[i] = 0

if __name__ == "__main__":
    n, m = map(int, input().split())
    graph = [[0] * (n + 1) for _ in range(n + 1)]
    check = [0] * (n + 1)
    cnt = 0

    for i in range(m):
        x, y = map(int, input().split())
        graph[x][y] = 1

    DFS(0,1)
    print(cnt)