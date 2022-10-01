N, K = map(int,input().split())
a = list(map(int,input().split()))

# a = list(combinations(a,3))
# sumList = list()
# for b in a:
#     sumList.append(sum(b))
# sumList.sort()
# sumList = set(sumList)
# print(sumList)

# 풀이
res = set()
for i in range(N):
    for j in range(i+1, N):
        for m in range(j+1, N):
            res.add(a[i] + a[j] + a[m])
res = list(res)
res.sort(reverse=True)
print(res[K-1])