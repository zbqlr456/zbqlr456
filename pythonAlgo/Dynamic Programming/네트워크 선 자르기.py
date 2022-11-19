import sys
sys.stdin = open("input.txt","rt")

def DFS(L):
    global dp
    if dp[L] > 0:
        return dp[L]
    if L == 1 or L == 2:
        return L
    else:
        dp[L] = DFS(L-1) + DFS(L-2)
        return dp[L]

if __name__ == "__main__":
    n = int(input())
    dp = [0] * (n+1)
    dp[1] = 1
    dp[2] = 2
    print(DFS(n))
