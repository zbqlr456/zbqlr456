import sys
import heapq

heap = []
while True:
    a = int(input())
    if a == -1:
        break
    elif a == 0:
        print(heapq.heappop(heap))
    else:
        heapq.heappush(heap,a)