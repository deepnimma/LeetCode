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
    public int maxDepth(TreeNode root) {
        return traverse(root, 0);
    }

    private int traverse(TreeNode curr, int depth) {
        if (curr == null) return depth;

        int ldepth = traverse(curr.left, depth + 1);
        int rdepth = traverse(curr.right, depth + 1);

        return Math.max(ldepth, rdepth);
    } // traverse
} // Solution