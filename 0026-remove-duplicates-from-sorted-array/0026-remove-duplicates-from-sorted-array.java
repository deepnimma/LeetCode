class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> a = new ArrayList<>();

        for (int i : nums) {
            if (a.indexOf(i) == -1)
                a.add(i);
        }

        for (int i = 0; i < a.size(); i++)
            nums[i] = a.get(i);

        return a.size();
    }
}