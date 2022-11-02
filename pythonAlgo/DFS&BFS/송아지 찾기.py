import sys
from collections import deque

sys.stdin = open("input.txt","rt")
#
# start, end = map(int,input().split())
# check = [0] * 10001
#
# dq = deque()
# dq.append((start,0))
#
# while deque:
#     now = dq.popleft()
#     if now[0] == end:
#         print(now[1])
#         break
#     if now[0] < 1 or now[0]>10000 or check[now[0]] == 1:
#         continue
#     check[now[0]] = 1
#     dq.append((now[0] + 5,now[1] + 1))
#     dq.append((now[0] + 1,now[1] + 1))
#     dq.append((now[0] - 1,now[1] + 1))

# 풀이
MAX = 10000

ch = [0] + (MAX+1)
dis = [0] + (MAX+1) # 이동 횟수를 체크하기 위한 dis 배열을 똑같이 만듬
n,m = map(int,input().split())
ch[n] = 1
dis[n] = 0
dQ = deque()
dQ.append(n)

while dQ:
    now = dQ.popleft()

    if now == m:
        print(dis[now])
        break

    for next in (now - 1, now + 1, now + 5) # for문 활용
        if 0 < next <= MAX:
            if ch[next] == 0:
                dQ.append(next)
                ch[next] = 1
                dis[next] = dis[now] + 1
