/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public void dfs(Node root, ArrayList<Integer> list) {
        // code here
        if(root == null) return;
        dfs(root.left, list);
        
        dfs(root.right, list);
        list.add(root.data);
        
    }
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        dfs(root, list);
        return list;
    }
}
