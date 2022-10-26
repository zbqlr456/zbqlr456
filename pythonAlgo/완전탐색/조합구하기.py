import sys


def DFS(L, start):
    global cnt
    if L == m:
        for i in range(m):
            print(a[i],end = ' ')
        print()
        cnt += 1
        return
    for i in range(start,n+1):
        a[L] = i
        DFS(L+1,i+1)

if __name__ == "__main__":
    n, m = map(int, input().split())
    cnt = 0
    a = [0] * m
    DFS(0,1)
    print(cnt)