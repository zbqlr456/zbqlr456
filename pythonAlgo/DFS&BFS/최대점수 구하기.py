import sys

sys.stdin = open("input.txt", "r")


def DFS(L, sum, time):
    global res
    if time > m:
        return
    if L == n:
        if sum > res:
            res = sum
    else:
        DFS(L+1, sum + pv[L],time+pt[L]) # 문제 풀 경우
        DFS(L+1, sum, time) # 안 풀 경우


if __name__ == "__main__":
    n, m = map(int, input().split())
    a = [[0] * 2 for _ in range(n)]
    pv = []
    pt = []
    for i in range(n):
        a, b = map(int, input().split())
        pv.append(a)
        pt.append(b)
    res = -1e9
    DFS(0, 0, 0)
    print(res)
