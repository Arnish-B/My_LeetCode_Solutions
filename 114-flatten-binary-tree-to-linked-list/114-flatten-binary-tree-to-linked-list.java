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
    public void flatten(TreeNode node) {
         if (node == null)
            return;
        // Or if it is a leaf node
        if (node.left == null && node.right == null)
            return;
        // If root.left children exists then we have to make
        // it node.right (where node is root)
        if (node.left != null) {
            // Move left recursively
            flatten(node.left);
            // Store the node.right in Node named tempNode
            TreeNode tempNode = node.right;
            node.right = node.left;
            node.left = null;
            // Find the position to insert the stored value
            TreeNode curr = node.right;
            while (curr.right != null)
                curr = curr.right;
            // Insert the stored value
            curr.right = tempNode;
        }
        // Now call the same function for node.right
        flatten(node.right);
        
    }
}