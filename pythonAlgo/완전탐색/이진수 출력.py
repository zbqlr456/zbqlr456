import sys
sys.stdin = open("input.txt", "rt")
# result = ''
# def DFS(x):
#     global result
#     if x == 0:
#         return
#     result = str(x % 2) + result
#     DFS(x//2)
#
# if __name__=="__main__":
#     DFS(int(input()))
#     print(result)

# 풀이
def DFS(n):
    if n == 0:
        return
    else:
        print(n%2, end='')
        DFS(n//2)
if __name__ == "__main__":
    DFS(input())