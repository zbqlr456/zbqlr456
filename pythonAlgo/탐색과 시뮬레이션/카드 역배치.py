l = [0] * 21

for i in range(1,21):
    l[i] = i

for i in range(10):
    start, end = map(int,input().split())
    tmp = l[start:end+1]
    tmp.reverse()
    l[start:end+1] = tmp

l.pop(0)
for x in l:
    print(x, end = ' ')

# 풀이

# a = list(range(21)) # 0부터 21까지 리스트에 숫자 넣어서 만들어 준다
# for _ in range(10): # 아무 변수 없이 그냥 10번 돌릴 때
#     s, e = map(int, input().split())
#     for i in range((e-s+1)//2):
#          a[s+i], a[e-i] = a[e-i], a[s+i]
# a.pop(0)
# for x in a:
#     print(x, end = ' ')