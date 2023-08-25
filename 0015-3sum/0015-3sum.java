class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> holder = new LinkedList<>();
        Set<List<Integer>> holderb = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            //System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[j]);
                    a.add(nums[k]);

                    holderb.add(a);

                    j++;
                    k--;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                } // if-else
            } // while
        } // for

        holder.addAll(holderb);

        return holder;
    } // threeSum
} // Solution