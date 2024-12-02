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
    private int goodNodes = 0;

    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return goodNodes;
    } // goodNodes

    private void dfs(TreeNode curr, int max) {
        if (max <= curr.val) goodNodes++;
        if (curr.right != null) dfs(curr.right, Math.max(curr.val, max));
        if (curr.left != null) dfs(curr.left, Math.max(curr.val, max));
    } // dfs
} // Solution