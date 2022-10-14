# n = int(input())
#
# a = [[0]*2 for i in range(n)]
#
# for i in range(n):
#     a[i][0],a[i][1] = map(int,input().split())
#
# a.sort()
# result = 0
# for i in range(n-1):
#     cnt = 1
#     end = a[i][1]
#     for j in range(i+1,n):
#         if a[j][0] >= end:
#             end = a[j][1]
#             cnt += 1
#     if cnt > result:
#         result = cnt
#
# print(result) # 시간초과

#풀이

n = int(input())

meeting = []

for i in range(n):
    s, e = map(int, input().split())
    meeting.append((s,e))  # 이렇게 튜플로 넣기

meeting.sort(key=lambda x : (x[1],x[0])) # 람다 함수로 정렬 기준 잡기
# 끝나는 기준으로 정렬해야 됨!!

et = 0
cnt = 0

for s, e in meeting: # 각각 시작 시간 끝나는 시간 이렇게 쓸 수 있음
    if s >= et:
        et = e
        cnt += 1

print(cnt)