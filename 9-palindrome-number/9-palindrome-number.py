class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        
        if x < 10:
            return True
        
        # Get the last digit
        last_digit = x % 10
        
        # If number ends with 0 it cannot be a palindrome
        if last_digit == 0:
            return False
        
        # Get the reversed number
        reversed_number = 0
        while(x > reversed_number):
            reversed_number = reversed_number * 10 + last_digit
            x = x // 10
            last_digit = x % 10
            
        # Check if the reversed number is the same as the original number
        if x == reversed_number or x == reversed_number // 10:
            return True
        else:
            return False