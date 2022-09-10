class Solution:
    def validMountainArray(self, arr: list[int]) -> bool:
        # Checking array length
        if len(arr) < 3:
            return False
        
        # Searching for Max Value
        highest_val = max(arr)
        highest_index = arr.index(highest_val)
        
        # Splitting the Array
        a = arr[:highest_index]
        b = arr[highest_index:]
        
        # Checking if any arrays are empty
        if a == [] or b == [] or (len(b) == 1 and len(a) != 1):
            return False
        
        # Sorting the arrays
        sorted_a = sorted(a)
        sorted_b = sorted(b, reverse=True)
        
        print(a)
        print(sorted_a)
        print(b)
        print(sorted_b)
        
        # Checking for duplicates
        for i, val in enumerate(sorted_a[:-1]):
            if sorted_a[i + 1] == val:
                return False
        
        for i, val in enumerate(sorted_b[:-1]):
            if sorted_b[i + 1] == val:
                return False
            
        # Comparing the Arrays
        if sorted_a == a and sorted_b == b:
            return True
        else:
            return False
    
if __name__ == '__main__':
    print(Solution().validMountainArray([0, 3, 2, 1]))
   # print(Solution().validMountainArray([0,3,2,1]))
   # print(Solution().validMountainArray([0, 0, 0]))
   # print(Solution().validMountainArray([1, 2, 3, 4, 5, 6]))
   # print(Solution().validMountainArray([0, 3, 1]))
    