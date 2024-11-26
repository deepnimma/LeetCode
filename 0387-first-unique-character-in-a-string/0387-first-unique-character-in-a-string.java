class Solution {
    public int firstUniqChar(String s) {
        char[] sc = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : sc) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        } // for

        for (int i = 0; i < sc.length; i++) {
            if (map.get(sc[i]) == 1) return i;
        } // for

        return -1;
    } // firstUniqChar
} // Solution