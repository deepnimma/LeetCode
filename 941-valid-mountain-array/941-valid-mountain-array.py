class Solution:
    def validMountainArray(self, arr: list[int]) -> bool:
        # Checking array length
        if len(arr) < 3:
            return False
        
        l = 0
        r = len(arr) - 1
        
        while(arr[l] < arr[l + 1]):
            l += 1
            
            # Is the final element
            if(l == len(arr) - 1):
                return False
            
        while(arr[r] < arr[r - 1]):
            r -= 1
            
            # Is the first element
            if(r == 0):
                return False
            
        if(l == r):
            return True
        
        return False