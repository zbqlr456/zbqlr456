n,m = map(int,input().split())

# n개의 수를 오름차순 정렬 후 n개의 수 중 한개인 m이 주어지면 m이 정렬된 상태에서 몇번째 있는지?

a = list(map(int,input().split()))

a.sort()

start, end= 0, n-1
result = 0
while start <= end:
    mid = (start + end) // 2
    if a[mid] > m:
        end = mid
    elif a[mid] == m:
        print(mid+1)
        break
    else:
        start = mid+1