class Solution {
    public int longestMountain(int[] arr) {
        int maxLen = 0;
        int l = 0, r = 0;
        boolean asc = false, desc = false;
        
        while (r+1 < arr.length-1) {
            //ascending
            while (r+1 < arr.length && arr[r+1] > arr[r]) {
                r++;
                asc = true;
            } 
            
            //check for plateau
            while (r + 1 < arr.length && arr[r+1] == arr[r]) {
                asc = false;
                r++;
            }
            
            //descending
            while (r+1 < arr.length && arr[r+1] < arr[r]) {
                r++;
                desc = true;
            }
            
            if (asc && desc) maxLen = Math.max(maxLen, r - l + 1);
            
            l = r;
            asc = false;
            desc = false;
        } //while
        
        return maxLen;
    } //longestMountain
} //Solution