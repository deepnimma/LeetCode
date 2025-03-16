class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();

        if (cs.length != ct.length) return false;

        Arrays.sort(ct);
        Arrays.sort(cs);

        for (int i = 0; i < ct.length; i++) {
            if (cs[i] != ct[i]) return false;
        } // for

        return true;
    } // isAnagram
} // Solution