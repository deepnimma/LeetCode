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
    List<List<Integer>> lvls = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return lvls;
        helper(root, 0);
        return lvls;
    } // levelOrder
    
    private void helper(TreeNode node, int lvl) {
        if (lvls.size() == lvl) lvls.add(new ArrayList<Integer>());

        lvls.get(lvl).add(node.val);

        if (node.left != null) helper(node.left, lvl + 1);
        if (node.right != null) helper(node.right, lvl + 1);
    } // helper
} // Solution