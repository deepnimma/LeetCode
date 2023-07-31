class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> a = new HashMap<>();

        for (int b : nums) {
            if (a.get(b) != null)
                return true;
            else
                a.put(b, 1);
        }

        return false;
    }
}