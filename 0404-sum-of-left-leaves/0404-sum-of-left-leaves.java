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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        
        int sum = 0;
        
        // Check if the left child exists AND is a leaf node
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val; 
        } else {
            // Otherwise, keep searching down the left branch
            sum += sumOfLeftLeaves(root.left);
        }
        
        // Always search the right branch (it might have left leaves of its own further down)
        sum += sumOfLeftLeaves(root.right);
        
        return sum;
    }
}