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
    private int diameter = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        longest(root);
        return diameter;
    } // diameterOfBianryTree

    private int longest(TreeNode curr) {
        if (curr == null) return 0;

        int left = longest(curr.left);
        int right = longest(curr.right);

        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    } // longest
} // diameterOfBinaryTree