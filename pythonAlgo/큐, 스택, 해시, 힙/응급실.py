import sys
from collections import deque

sys.stdin = open("input.txt", "rt")

n, m = map(int,input().split())

Q = [(pos, val) for pos, val in enumerate(list(map(int,input().split())))] # 인덱스랑 함께 튜플 형태로 저장

Q = deque(Q)
cnt = 0

while True:
    cur = Q.popleft()
    if any(cur[1] < x[1] for x in Q): # 위험도 검사 (단 한명이라도 위험도가 큰 사람이 있으면 실행)
        Q.append(cur)
    else:
        cnt += 1
        if cur[0] == m:
            break
print(cnt)
