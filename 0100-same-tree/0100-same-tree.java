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
    List tree1 = new ArrayList<>();
    List tree2 = new ArrayList<>();

    public void preorder(TreeNode node,int flag){
       if(flag == 1){
           if(node == null){
               tree1.add('X');
               return;
           }
           else{
               tree1.add(node.val);
               preorder(node.left,1);
               preorder(node.right,1);
           }
       }
        else{
            if(node == null){
               tree2.add('X');
               return;
           }
           else{
               tree2.add(node.val);
               preorder(node.left,2);
               preorder(node.right,2);
           }
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        preorder(p,1);
        preorder(q,2);
        return (tree1.equals(tree2));
    }
}