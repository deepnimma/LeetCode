class Solution:
    def romanToInt(self, s: str) -> int:
        total_sum = 0
        values = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        i = 0
        
        while i < len(s):
            if i < len(s) - 1 and values[s[i]] < values[s[i + 1]]:
                total_sum += values[s[i + 1]] - values[s[i]]
                i += 1
            else:
                total_sum += values[s[i]]

            i += 1
        
        return total_sum
