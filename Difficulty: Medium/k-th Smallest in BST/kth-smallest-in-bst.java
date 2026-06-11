/*
Definition for Node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public void inOrder(Node root, ArrayList<Integer> list){
        if(root == null) return;
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }
    public int kthSmallest(Node root, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        if(list.size() < k) return -1;
        
        return list.get(k-1);
    }
}