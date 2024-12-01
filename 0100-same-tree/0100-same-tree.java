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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return traverse(p, q);
    } // isSameTree

    private boolean traverse(TreeNode currp, TreeNode currq) {
        if (currp == null && currq == null) return true;
        else if (currp == null || currq == null) return false;
        else if (currp.val != currq.val) return false;

        return (traverse(currp.left, currq.left)) && (traverse(currp.right, currq.right));
    } // traverse
} // Solution