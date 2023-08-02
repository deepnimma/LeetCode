import java.util.Hashtable;

class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();

        if (sl != tl) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < sl; i++) {
            Character sc = s.charAt(i);
            Character tc = t.charAt(i);

            map.put(sc, map.getOrDefault(sc, 0) + 1);
            map.put(tc, map.getOrDefault(tc, 0) - 1);
        } // for

        for (int i : map.values())
            if ( i != 0 )
                return false;
        
        return true;
    } // isAnagram
} // Solution