import sys

sys.stdin = open("input.txt", "r")
#
# def DFS(L, word):
#     global cnt
#
#     if L == len(code):
#         print(word)
#         cnt += 1
#         return
#     else:
#         if code[L] == '0':
#             return
#
#         elif code[L] == '1' and L != len(code) - 1:
#             DFS(L + 1, word + alpha[int(code[L])])
#             DFS(L + 2, word + alpha[int(code[L]) * 10 + int(code[L + 1])])
#
#         elif code[L] == '2' and L != len(code) - 1:
#             DFS(L + 1, word + alpha[int(code[L])])
#             if int(code[L + 1]) < 7:
#                 DFS(L + 2, word + alpha[int(code[L]) * 10 + int(code[L + 1])])
#         else:
#             DFS(L + 1, word + alpha[int(code[L])])
#
# if __name__ == "__main__":
#     code = input()
#     alpha = list(range(27))
#     cnt = 0
#     for i in range(1, len(alpha)):  # index 1은 A ~ index 26은 Z
#         alpha[i] = chr(i + 64)
#     DFS(0, '')
#     print(cnt)
# 다른 풀이

def DFS(L,P):
    global cnt
    if L == n:
        cnt += 1
        for j in range(P):
            print(chr(res[j]+64),end = '')
        print()
    else:
        for i in range(1,27): # 알파벳 기준으로 가지를 뻣었다
            if code[L] == i:
                res[P] = i
                DFS(L+1,P+1)
            elif i>= 10 and code[L] == i//10 and code[L+1] == i%10:
                res[P] = i
                DFS(L+2, P+1)

if __name__ == "__main__":
    code = list(map(int,input()))
    n = len(code)
    code.insert(n,-1) # out of index 방지
    res = [0] * (n+3)
    cnt = 0
    DFS(0,0)
    print(cnt)