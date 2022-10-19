import sys
import heapq

sys.stdin = open("input.txt", "rt")

heap = []
while True:
    a = int(input())
    if a == -1:
        break
    elif a == 0:
        print(-heapq.heappop(heap)) # 뺄 때 다시 - 붙이면 됨 
    else:
        heapq.heappush(heap,-a) # 넣을 때 - 붙이면 최대힙