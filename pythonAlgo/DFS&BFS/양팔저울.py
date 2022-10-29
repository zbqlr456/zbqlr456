import sys


def DFS(L, total):
    global res
    if L == k:
        if 0<total<=s:
            res.add(total)
    else:
        DFS(L+1, total + G[L])
        DFS(L+1, total - G[L])
        DFS(L+1, total)

if __name__ == "__main__":
    k = int(input())
    G = list(map(int,input().split()))
    s = sum(G)
    res = set()
    DFS(0,0)

    print(s - len(res))