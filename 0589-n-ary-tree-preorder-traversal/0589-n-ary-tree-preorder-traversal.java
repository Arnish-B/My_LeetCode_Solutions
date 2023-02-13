/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> fin = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        traverse(root);
        return fin;
        
    }
    public void traverse(Node root){
        if(root==null){
            return;
        }
        fin.add(root.val);
        for(Node x:root.children){
            traverse(x);
        }
        
    }
}