class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        pair = {}
        
        for i in range(len(nums)):
            if (target - nums[i]) in pair:
                return [pair[(target - nums[i])], i]
            else:
                pair[nums[i]] = i
                
        return pair