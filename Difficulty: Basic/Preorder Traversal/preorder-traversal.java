/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public void dfs(Node root, ArrayList<Integer> list) {
        //  code here
        if(root == null) return;
        list.add(root.data);
        dfs(root.left, list);
        dfs(root.right, list);
    }
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root, list);
        
        return list;
    }
}