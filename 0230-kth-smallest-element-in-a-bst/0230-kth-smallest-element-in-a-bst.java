/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> nums = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        dfs(root);
        return nums.get(k - 1);
    } // kthSmallest

    private void dfs(TreeNode curr) {
        if (curr == null) return;
        dfs(curr.left);
        nums.add(curr.val);
        dfs(curr.right);
    } // dfs
} // Solution