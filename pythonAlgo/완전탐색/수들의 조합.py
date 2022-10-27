# import sys
#
# sys.stdin = open("input.txt", "rt")
#
# def DFS(L, start):
#     global cnt
#     if L == k:
#         if sum(b) % m == 0:
#             cnt += 1
#         return
#     for i in range(start,n):
#         b[L] = a[i]
#         DFS(L+1,i+1)
#
# if __name__ == "__main__":
#     n, k = map(int, input().split())
#     a = list(map(int,input().split()))
#     b = [0] * k
#     cnt = 0
#     m = int(input())
#     DFS(0,0)
#     print(cnt)

import sys
import itertools as it
#sys.stdin=open("input.txt", "r")
n, k=map(int, input().split())
a=list(map(int, input().split()))
m=int(input())
cnt=0
for x in it.combinations(a, k):
    if sum(x)%m==0:
        cnt+=1
print(cnt)
