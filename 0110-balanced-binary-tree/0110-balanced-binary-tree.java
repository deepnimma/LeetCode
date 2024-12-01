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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        return (
            Math.abs(height(root.left) - height(root.right)) < 2 &&
            isBalanced(root.left) &&
            isBalanced(root.right)
        );
    } // isBalanced

    private int height(TreeNode curr) {
        if (curr == null) return -1;
        return 1 + Math.max(height(curr.left), height(curr.right));
    } // height
} // Solution