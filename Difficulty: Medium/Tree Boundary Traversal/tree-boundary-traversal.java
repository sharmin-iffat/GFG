/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(root.data);
        
        if(root.left == null && root.right == null) return list;
        
        leftBoundary(root.left, list);
        leafNodes(root, list);
        rightBoundary(root.right, list);
        
        return list;
    }
    void leftBoundary(Node root, ArrayList<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        
        list.add(root.data);
        
        if(root.left != null) leftBoundary(root.left, list);
        else leftBoundary(root.right, list);
    }
    
    void leafNodes(Node root, ArrayList<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null){
            list.add(root.data);
            return;
        } 
        
        leafNodes(root.left, list);
        leafNodes(root.right, list);
    }
    
    void rightBoundary(Node root, ArrayList<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        
        if(root.right != null) rightBoundary(root.right, list);
        else rightBoundary(root.left, list);
        
        list.add(root.data);
    }
}