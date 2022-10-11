import sys
sys.stdin = open("input.txt","rt")

k,n = map(int,input().split())
a = []
for _ in range(k):
    a.append(int(input()))

start, end = 1, max(a)
#
# while True:
#     mid = (start + end)//2
#     total = 0
#     for i in range(k):
#         total += a[i]//mid
#     if total == n:
#         print(mid)
#         break # break를 하면 안됐다
#     if total > n:
#         start = mid + 1
#     else:
#         end = mid

# 풀이
def Count(length): # 렌선별로 length로 나눠서 몇개 나오는지 체크하는 함수
    cnt = 0
    for x in a:
        cnt += (x//length)
    return cnt
res = 0
while start <= end:
    mid = (start+end)//2
    if Count(mid) >= n:
        res = mid # 중간에 break없이 끝까지 함수를 돌리는 것이 최대를 찾는 방법!
        start = mid + 1
    else:
        end = mid - 1
print(res)