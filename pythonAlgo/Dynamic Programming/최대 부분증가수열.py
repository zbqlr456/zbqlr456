import sys

n = int(input())
a = list(map(int,input().split()))
a.insert(0,0)
dp = [0] * (n+1)
dp[1] = 1
dp[2] = 1
res = 0

for i in range(3,n+1):
    largest = 0
    for j in range(i-1,0,-1):
        if a[i] > a[j]:
            if largest < dp[j]:
                largest = dp[j]
    dp[i] = largest + 1
print(max(dp))