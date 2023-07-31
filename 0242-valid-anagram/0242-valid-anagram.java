class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        List<Character> a = new ArrayList<>();

        for (char c : s.toCharArray()) {
            a.add(c);
        } // for

        for (Character c : t.toCharArray()) {
            if (a.indexOf(c) == -1)
                return false;
            a.remove(c);
        }

        return true;
    }
}