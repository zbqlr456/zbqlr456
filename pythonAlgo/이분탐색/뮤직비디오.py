import sys

sys.stdin = open("input.txt", "rt")

def Check(capacity):
    cnt = 1
    hap = 0
    for x in Music:
        if hap + x > capacity:
            cnt += 1
            hap = x
        else:
            hap += x

    return cnt

n, m = map(int, input().split())
Music = list(map(int, input().split()))
largest = max(Music)

start, end = 1, sum(Music)
result = 0
while start <= end:
    mid = (start + end) // 2
    if mid >= largest and Check(mid) <= m:
        result = mid
        end = mid - 1
    else:
        start = mid + 1

print(result)
