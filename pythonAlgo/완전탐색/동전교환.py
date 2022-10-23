import sys

def DFS(L,total):
    global change, result
    if L >= result or total > change:
        return
    if total == change:
        if L < result:
            result = L
        return
    for i in range(n):
        total += coins[i]
        DFS(L+1,total)
        total -= coins[i]
if __name__ == "__main__":
    n = int(input())
    coins = list(map(int,input().split()))
    change = int(input())
    result = 1e9
    coins.sort(reverse=True)
    DFS(0,0)
    print(result)
# 시간 초과

# 풀이
# def DFS():
#
# if __name__ == "__main__":
#     n = int(input())
#     a = list(map(int,input().split()))
#     m = int(input())
#     res = 1e9
#     a.sort(reverse=True)