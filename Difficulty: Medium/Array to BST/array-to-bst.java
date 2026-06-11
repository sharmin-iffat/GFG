/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    public Node sortedArrayToBST(int[] arr) {
        // code here
        int n = arr.length;
        return helper(arr, 0, n-1);
        
    }
    public Node helper(int[] arr, int lo, int hi) {
        
        if(lo>hi) return null;
        
        int mid = lo + (hi - lo)/2;
        
        Node root = new Node(arr[mid]);
        
        root.left = helper(arr, lo, mid-1);
        
        root.right = helper(arr, mid +1, hi);
        
        return root;
    }
    
}