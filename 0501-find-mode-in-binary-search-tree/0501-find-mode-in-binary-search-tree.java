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
    Map<Integer, Integer> freq = new HashMap<>();
    public int[] findMode(TreeNode root) {
        if(root.right == null && root.left == null){
            int fin[] = new int[1];
            fin[0] = root.val;
            return fin;
        }
        populateFreq(root);       
        List<Integer> f = new ArrayList<>();
        int max = 0;
        for(Map.Entry<Integer,Integer> mapElement : freq.entrySet()){
            if(mapElement.getValue() >= max){
                max = mapElement.getValue();
            }
        }
        for(Map.Entry<Integer,Integer> mapElement : freq.entrySet()){
            if(mapElement.getValue() == max){
                f.add(mapElement.getKey());
            }
        }
        // System.out.println(freq);
        // System.out.println(max);

        int[] fin = new int[f.size()];
        for(int i =0;i<fin.length;i++){
            fin[i] = f.get(i);
        }
        return fin; 
    }

    public void populateFreq(TreeNode root){
        if(root == null){
            return;
        }
        if(freq.containsKey(root.val)){
            freq.put(root.val, freq.get(root.val)+1);
        }
        else{
            freq.put(root.val, 1);
        }
        populateFreq(root.left);
        populateFreq(root.right);
    }
}