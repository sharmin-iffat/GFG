/*
class Node {
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    int count;
    int getCount(Node root, int l, int h) {
        // Your code here
        count = 0;
        
        helper(root, l, h);
        
        return count;
        
    }
    void helper(Node root, int l, int h) {
        // Your code here
        if(root == null) return;
        if(root.data >= l && root.data <= h) count++;
        
        if(root.data > l) helper(root.left, l, h);
        
        if(root.data < h) helper(root.right, l, h);
        
    }
}

