import sys
sys.stdin = open("input.txt", "rt")
# result = 0
# def DFS(x):
#     global result
#     if x == n:
#         hap = 0
#         for i in range(n):
#             if ch[i] == 1:
#                 hap += a[i]
#         if hap in haps:
#             result = 1
#         else:
#             haps.append(hap)
#         return
#     else:
#         ch[x] = 1
#         DFS(x+1)
#         ch[x] = 0
#         DFS(x+1)
# if __name__ == "__main__":
#     n = int(input())
#     a = list(map(int,input().split()))
#     haps = []
#     cnt = 1
#     ch = [0] * n
#     DFS(0)
#     if result == 1:
#         print("YES")
#     else:
#         print("NO")
# 전역변수 사용

# 풀이
# 완전히 합의 관점에서 접근함
def DFS(L,sum):
    if sum > total // 2: # 시간복잡도 줄일 수 잇음
        return
    if L == n:
        if sum == total - sum: # 두개의 부분집합으로 나뉜경우기 때문에 이렇게도 가능
            print("YES")
            sys.exit(0)
    else:
        DFS(L+1,sum+a[L])
        DFS(L+1, sum)

if __name__ == "__main__":
    n = int(input())
    a = list(map(int,input().split()))
    total = sum(a)
    DFS(0,0)
    print("NO")