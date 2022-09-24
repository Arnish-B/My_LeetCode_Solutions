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
    
    List<List<Integer>> fin = new ArrayList<>();
    
    private void dfs(TreeNode node, List<Integer> path, int remainingSum){
        if(node == null){
            return;
        }
        
        path.add(node.val);
        
        if(node.left == null && node.right == null && remainingSum == node.val){
            fin.add(new ArrayList(path));
        }
        dfs(node.left, path, remainingSum - node.val);
        dfs(node.right, path, remainingSum - node.val);
        
        path.remove(path.size() - 1);
        
    }
    
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> pathSum = new ArrayList<>();
        dfs(root, pathSum, targetSum);
        return fin;
    }
}