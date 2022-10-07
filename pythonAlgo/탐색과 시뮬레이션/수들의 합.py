# n, m = map(int,input().split())
# l = list(map(int,input().split()))
# cnt = 0
#
# for i in range(n):
#     sumA = l[i]
#     if sumA == m:
#         cnt +=1
#         continue
#     for j in range(i+1,n):
#         sumA += l[j]
#         if sumA == m:
#             cnt += 1
#             break
#         if sumA > m:
#             break
# print(cnt)

# 풀이
# 시간초과 안나게 하는 것이 중요 - 이것도 투포인터 활용
n, m = map(int,input().split())
a = list(map(int,input().split()))
lt = 0 # 왼쪽 포인터(수열의 시작) i
rt = 1 # 오른쪽 포인터(수열의 끝) j
tot = a[0]
cnt = 0
while True:
    if tot<m:
        if rt<n:
            tot+=a[rt]
            rt += 1
        else:
            break
    elif tot == m:
        cnt += 1
        tot -=a[lt]
        lt += 1
    else:
        tot -= a[lt]
        lt += 1

print(cnt)