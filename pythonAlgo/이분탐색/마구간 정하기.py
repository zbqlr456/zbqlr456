import sys
sys.stdin = open("input.txt", "rt")

n, c = map(int,input().split())

a = [] * n

for i in range(n):
    a[i] = int(input())

a.sort()

start, end = a[0], a[n-1]


def Count(length):
    cnt = 1
    endPoint = a[0]
    for i in range(1, n):
        if a[i] - endPoint >= length:
            cnt += 1
            endPoint = a[i]
    return cnt

while start <= end:
    mid = (start + end)//2
    if Count(mid) >= c:
        result = mid
        start = mid + 1
    else:
        end = mid - 1
print(result)