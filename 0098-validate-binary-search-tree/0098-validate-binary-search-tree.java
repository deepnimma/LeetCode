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
    Queue<Integer> nums = new LinkedList<>();

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        dfs(root);
        int prev = nums.poll();
        while (!nums.isEmpty()) {
            System.out.println(prev + " " + nums.peek());
            if (nums.element() <= prev) return false;
            prev = nums.poll();
        } // while

        return true;
    } // isValidBST

    private void dfs(TreeNode curr) {
        if (curr == null) return;
        dfs(curr.left);
        nums.offer(curr.val);
        dfs(curr.right);
    } // dfs
} // Solution