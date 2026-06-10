// User function Template for Java

class Solution {
    public static void flatten(Node root) {
        // code here
        if(root == null) return;
        ArrayList<Node> list = new ArrayList<>();
        
        dfs(root, list);
        
        Node curr = list.get(0);
        int i=1;
        while(i < list.size()){
            
            curr.left = null;
            curr.right = list.get(i);
            curr = curr.right;
            i++;
        }
        curr.left = null;
        curr.right = null;
        
        
    }
    static void dfs(Node root, ArrayList<Node> list){
        if(root == null) return;
        
        list.add(root);
        dfs(root.left, list);
        dfs(root.right, list);
        
    }
}