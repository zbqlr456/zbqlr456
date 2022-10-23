import sys

# def DFS(i, total):
#     global heaviest
#     if total > c:
#         return
#     if c == total:
#         print(total)
#         sys.exit(0)
#     if i == n:
#         if heaviest < total < c:
#             heaviest = total
#         return
#     DFS(i + 1, total + a[i])
#     DFS(i + 1, total)
#
#
# if __name__ == "__main__":
#     c, n = map(int, input().split())
#     a = []
#     heaviest = 0
#     for _ in range(n):
#         a.append(int(input()))
#     weight = 0
#     DFS(0, 0)
#     print(heaviest)
# 시간 초과

# 풀이
def DFS(L, sum, tsum):
    global result
    if sum + (total - tsum) < result:
        # 여태 더한 값과 앞으로 더할 값을 다 더했는데도 결과값보다 작으면 더 볼필요 없이 return
        return
    if sum > c:
        return
    if L == n:
        if sum > result:
            result = sum
    else:
        DFS(L + 1, sum + a[L], tsum + a[L])
        DFS(L + 1, sum, tsum + a[L])


if __name__ == "__main__":
    c, n = map(int, input().split())
    a = [0] * n
    result = -1e9
    for i in range(n):
        a[i] = int(input())
    total = sum(a)
    DFS(0, 0, 0)
    print(result)
