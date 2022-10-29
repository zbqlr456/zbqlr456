import sys

sys.stdin = open("input.txt", "r")


def DFS(start, total):
    global res
    if start == n+1:
        if total > res:
            res = total
        return
    else:
        if start + t[start] <= n+1:
            DFS(start+t[start],total + p[start])
        DFS(start+1,total)

if __name__ == "__main__":
    n = int(input())
    t = []
    p = []
    t.append(0)
    p.append(0)
    for i in range(n):
        a, b = map(int, input().split())
        t.append(a)
        p.append(b)
    res = -1e9
    DFS(1, 0)
    print(res)
