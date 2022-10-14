import sys
sys.stdin = open("input.txt", "rt")

n,m = map(int, input().split())
l = list(map(int,input().split()))

l.sort(reverse=True)

cnt = 0
while l:
    if len(l) != 1 and l[0] + l[len(l) - 1] <= m: # [len(l) - 1]보다 [-1]이 더 파이썬 스러운것 같음
        l.pop()
    l.pop(0)
    cnt += 1

print(cnt)