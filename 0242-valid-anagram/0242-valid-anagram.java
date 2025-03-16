class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] cnt = new int[257];

        for (char c : s.toCharArray()) {
            cnt[c - '0']++;
        } // for

        for (char c : t.toCharArray()) {
            cnt[c - '0']--;
        } // for

        for (int i : cnt) if (i != 0) return false;
        return true;
    } // isAnagram
} // Solution