n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]
m = int(input())
for _ in range(m):
    row, direction ,count = map(int,input().split())
    for _ in range(count):
        if direction == 0:
            graph[row - 1].append(graph[row - 1].pop(0))
        else:
            graph[row-1].insert(0,graph[row - 1].pop())

s = 0
e = n
hap = 0
for i in range(n):
    for j in range(s,e):
        hap += graph[i][j]
    if i < n//2:
        s += 1
        e -= 1
    else:
        s -= 1
        e += 1
print(hap)