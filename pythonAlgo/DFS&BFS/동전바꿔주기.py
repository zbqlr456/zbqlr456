import sys

def DFS(L, total):
    global cnt
    if total > T:
        return
    if L == k:
        if total == T:
            cnt += 1
        return
    else:
        for i in range(number[L]+1):
            DFS(L+1,total+coins[L]*i)
if __name__ == "__main__":
    T = int(input())
    k = int(input())
    coins = []
    number = []
    cnt = 0
    for i in range(k):
        a,b = map(int,input().split())
        coins.append(a)
        number.append(b)
    DFS(0,0)
    print(cnt)