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
    private int height(TreeNode root, int[] diameter) {
        // Base Case
        if (root == null)
            return 0;

        // Finding the leftHeight and RightHeight Recursively
        int leftHeight = height(root.left, diameter);
        int rightHeight = height(root.right, diameter);

        // Storing the maximum distance betn two Nodes...
        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);
        // Returns the Max. height of the Tree
        return 1 + Math.max(leftHeight, rightHeight); 
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        height(root, diameter);

        return diameter[0];
    }
}