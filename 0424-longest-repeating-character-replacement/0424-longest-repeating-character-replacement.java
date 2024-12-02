class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new HashMap<>();
        int result = 0, mostFreq = -1;
        int l = 0, r = 0;

        while (r < s.length()) {
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            mostFreq = Math.max(mostFreq, count.get(s.charAt(r)));

            while (r - l + 1 - mostFreq > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            } // while

            result = Math.max(result, r - l + 1);
            r++;
        } // while

        return result;
    } // characterReplacement
} // Solution