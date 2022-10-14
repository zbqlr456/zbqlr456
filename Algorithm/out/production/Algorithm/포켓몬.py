def solution(nums):
    answer = 0

    if len(set(nums)) > len(nums)//2:
        answer = len(nums)//2
    else:
        answer = len(set(nums))

    return answer

print(solution([3,1,2,3]))
print(solution([3,3,3,2,2,4]))
print(solution([3,3,3,2,2,2]))