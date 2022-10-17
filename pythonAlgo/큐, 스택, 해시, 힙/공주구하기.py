from collections import deque
n, m = map(int,input().split())

dq = deque(range(1,n+1))

while len(dq) >1:
    for i in range(m-1):
        dq.append(dq.popleft())
    dq.popleft()

print(dq[0])