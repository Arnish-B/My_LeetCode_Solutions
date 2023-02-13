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
    List<Integer> fin = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return fin;
        }
        else if(root.left == null && root.right == null){
            fin.add(root.val);
            return fin;
        }
        // fin.add(root.val);
        inorder(root);
        return fin;
    }

    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        fin.add(root.val);
        inorder(root.right);
    }
}