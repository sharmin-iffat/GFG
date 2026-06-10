/* A binary tree node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int findDist(Node root, int a, int b) {
        // code here
        
        Node anc = lca(root, a, b);
        
        int lDis = helper(anc, a, 0);
        int rDis = helper(anc,b, 0);
        
        return lDis + rDis;
        
        
    }
    Node lca(Node root, int a, int b){
        if(root == null) return null;
        if(root.data == a || root.data == b) return root;
        
        Node l = lca(root.left, a, b);
        Node r = lca(root.right, a, b);
        
        if(l != null && r != null) return root;
        
        return l == null ? r :l;
    }
    
    
    int helper(Node root, int target, int level){
        if(root == null) return -1;
        
        if (root.data == target)
            return level;
        
        int left = helper(root.left, target, level +1);
        
        if(left != -1) return left;
        
        return helper(root.right, target, level+1);
    }
}


