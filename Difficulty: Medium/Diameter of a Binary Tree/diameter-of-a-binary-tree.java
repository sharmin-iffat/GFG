/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    public int diameter(Node root) {
        // code here
        if(root == null) return 0;
        int a = level(root.left) + level(root.right);
        int b = diameter(root.left);
        int c = diameter(root.right);
        
        return Math.max(a, Math.max(b,c));
    }
    int level(Node root){
        if(root == null) return 0;
        
        int leftLevel = level(root.left);
        int rightLevel = level(root.right);
        
        return 1 + Math.max(leftLevel, rightLevel);
    }
}