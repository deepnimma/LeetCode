class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        products = [1] * len(nums)
        right = 1
        left = 1

        for i, n in enumerate(nums):
            products[i] *= left
            left *= n

            products[-1-i] *= right
            right *= nums[-1-i]

        return products
        