/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        levels(root, list, 0);
        return list;
        
    }
    void levels(Node root, ArrayList<Integer> list, int level){
        if(root == null) return;
        
        if (level == list.size()) {
            list.add(root.data);
        }else{
            list.set(level, root.data);
        }
        
        levels(root.left, list, level+1);
        levels(root.right, list, level+1);
    }
}