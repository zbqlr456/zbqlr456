import sys
# sys.stdin = open("input.txt","rt")
n,k = map(int, input().split())
cnt = 0
for i in range(1,n+1):
    if n%i == 0:
        cnt += 1
    if cnt == k:
        print(i)
        break
else: # for문이 break에 걸리지 않고 끝까지 돌고 끝났을 때
    print(-1)