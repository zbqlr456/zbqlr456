import sys

def DFS(L):
    global res
    if L == n:
        cha = max(money) - min(money)
        if cha < res:
            tmp = set()
            for x in money:
                tmp.add(x)
            if len(tmp) == 3:
                res = cha
    else:
        for i in range(3):
            money[i] += coin[L]
            DFS(L+1)
            money[i] -= coin[L]

if __name__ == "__main__":
    n = int(input())
    coin = []
    money = [0]*3
    res = 1e9
    for _ in range(n):
        coin.append(int(input()))
    DFS(0)
    print(res)