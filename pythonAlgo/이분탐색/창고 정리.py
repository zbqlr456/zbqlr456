import sys
sys.stdin = open("input.txt", "rt")

n = int(input())
l = list(map(int, input().split()))
m = int(input())

l.sort()

for _ in range(m):
    l[0] += 1
    l[n-1] -= 1
    l.sort()

print(l[n-1] - l[0])