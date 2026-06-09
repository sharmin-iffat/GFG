/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
}
}*/

class Solution {
    Node lca(Node root, int p, int q) {
        // code here
        if(root == null) return null;
        if(root.data == p || root.data ==q) return root;
        
        boolean pLiesInLeft = exist(root.left,p);
        boolean qLiesInLeft = exist(root.left,q);
        
        if(pLiesInLeft && qLiesInLeft) return lca(root.left, p, q);
        else if(!pLiesInLeft && !qLiesInLeft) return lca(root.right, p, q);
        else return root;
    }
    boolean exist(Node root, int val){
        if(root == null) return false;
        
        if(root.data == val) return true;
        
        return exist(root.left, val) || exist(root.right, val);
        
    }
}