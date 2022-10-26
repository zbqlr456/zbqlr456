import sys

sys.stdin = open("input.txt", "rt")


def DFS(L,sum):
    if L == n and sum == f:
        for x in p:
            print(x, end = ' ')
        sys.exit(0)
    else:
        for i in range(1, n+1):
            if ch[i] == 0:
                ch[i] = 1
                p[L] = i
                DFS(L+1, sum + (p[L] * b[L]))
                ch[i] = 0

if __name__ == "__main__":
    n, f = map(int, input().split())
    # 파스칼 운용
    p = [0] * n
    b = [1] * n # 얼마나 곱해야 하는지 저장하는 리스트
    ch = [0] * (n + 1) # 3C0 + 3C1 + 3C2 + 3C3
    for i in range(1,n):
        b[i] = b[i-1]*(n-i)//i
    DFS(0,0)