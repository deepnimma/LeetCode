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
    List<List<Integer>> levels = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();

        helper(root, 0);

        List<Integer> ans = new ArrayList<>();

        for (List<Integer> a : levels) {
            ans.add(a.get(a.size() - 1));
        } // for

        return ans;
    } // rightSideView

    private void helper(TreeNode curr, int level) {
        if (levels.size() == level) levels.add(new ArrayList<Integer>());

        levels.get(level).add(curr.val);

        if (curr.left != null) helper(curr.left, level + 1);
        if (curr.right != null) helper(curr.right, level + 1);
    } // helper
} // Solution