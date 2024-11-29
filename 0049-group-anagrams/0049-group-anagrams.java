class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] sc = s.toCharArray();
            Arrays.sort(sc);

            String ns = new String(sc);

            List<String> a = map.getOrDefault(ns, new ArrayList<>());
            a.add(s);
            map.put(ns, a);
        } // for

        return new ArrayList<>(map.values());
    } // groupAnagrams
} // Solution