import sys

sys.stdin = open("input.txt", "rt")

# def DFS(L):
#     global cnt
#     if L == m:
#         for i in range(m):
#             print(a[i],end=' ')
#         cnt += 1
#         print()
#         return
#     for i in range(1,n+1):
#         if check[i] == 1:
#             continue
#         a[L] = i
#         check[i] = 1
#         DFS(L+1)
#         check[i] = 0
# if __name__ == "__main__":
#     n, m = map(int,input().split())
#     a = [0] * m
#     check = [0] * (n+1)
#     cnt = 0
#     DFS(0)
#     print(cnt)

# 풀이

def DFS(L):
    global cnt
    if L == m:
        for j in range(L):
            print(res[j], end =' ')
        print()
        cnt += 1
    else:
        for i in range(1, n+1):
            if ch[i] == 0:
                ch[i] = 1
                res[L] = i
                DFS(L+1)
                ch[i] = 0

if __name__ == "__main__":
    n, m = map(int,input().split())
    res = [0] * m
    ch = [0] * (n+1)
    cnt = 0
    DFS(0)
    print(cnt)