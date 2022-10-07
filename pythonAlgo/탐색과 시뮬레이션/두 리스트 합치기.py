# n1 = int(input())
# l1 = list(map(int,input().split()))
#
# n2 = int(input())
# l2 = list(map(int,input().split()))
#
# l3 = l1 + l2
#
# l3.sort()
#
# for x in l3:
#     print(x, end=' ')

# 풀이
# 포인터 활용해서 O(n)으로 하는 방법
n = int(input())
a = list(map(int,input().split()))

m = int(input())
b = list(map(int,input().split()))

p1 = p2 = 0 # 포인터
c = []
while p1<n and p2<m:
    if a[p1] <= b[p2]:
        c.append(a[p1])
        p1 += 1
    else:
        c.append(b[p2])
        p2 += 1
if p1<n:
    c = c + a[p1:]
else:
    c = c + b[p2:]
for x in c:
    print(x, end=' ')