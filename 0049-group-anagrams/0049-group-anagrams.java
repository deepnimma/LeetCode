class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        char[] ca = null;
        String z = null;
        List<String> temp = null;

        for (String s : strs) {
            ca = s.toCharArray();
            Arrays.sort(ca);

            z = new String(ca);
            temp = map.getOrDefault(z, new ArrayList<>());
            temp.add(s);

            map.put(z, temp);
        } // for

        return new ArrayList<>(map.values());
    } // groupAnagrams
} // Solution