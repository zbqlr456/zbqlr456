import sys

sys.stdin = open("input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))
# l = list(range(1,n+1))
# l.sort(reverse=True)
# result = []
# for i in range(n-1,-1,-1):
#     cnt = 0
#     now = i + 1
#     for j in range(n):
#         if cnt == a[i]:
#             l.remove(now)
#             l.insert(j,now)
#             break
#         if l[j] > now:
#             cnt += 1
#
# for x in l:
#     print(x,end=' ')

# 풀이 - 빈 리스트에 값을 넣는 방식

seq = [0] * n
for i in range(n):
    for j in range(n):
        if a[i] == 0 and seq[j] == 0:
            seq[j] = i + 1
            break
        elif seq[j] == 0:
            a[i] -= 1
for x in seq:
    print(x, end='')
