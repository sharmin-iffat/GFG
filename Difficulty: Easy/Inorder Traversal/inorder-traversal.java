/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public void dfs(Node root, ArrayList<Integer> list) {
        // code here
        if(root == null) return;
        dfs(root.left, list);
        list.add(root.data);
        dfs(root.right, list);
        
    }
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        dfs(root, list);
        return list;
    }
}