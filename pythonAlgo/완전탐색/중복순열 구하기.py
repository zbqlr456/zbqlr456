import sys

def DFS(L):
    global res, cnt
    if L == m:
        for i in range(m):
            print(res[i],end=' ')
        print()
        cnt += 1
    else:
        for i in range(1,n+1):
            res[L] = i
            DFS(L+1)

if __name__ == "__main__":
    n, m = map(int, input().split())
    res = [0] * m
    cnt = 0
    DFS(0)
    print(cnt)
