n = int(input())

for i in range(n):
    s = input().upper()
    for j in range(len(s) // 2):
        if s[j] != s[len(s) - 1 - j]:
            print("#%d NO" %(i+1))
            break
    else:
        print("#%d YES" %(i+1))