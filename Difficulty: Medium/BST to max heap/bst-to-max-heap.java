// User function Template for Java

/*class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/

class Solution {
    static int idx;
    public static void convertToMaxHeapUtil(Node root) {
        // code here
        idx = 0;
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        postOrder(root, list);
    }
    private static void postOrder(Node root, ArrayList<Integer> list){
        if(root == null) return;
        
        postOrder(root.left, list);
        postOrder(root.right, list);
        root.data = list.get(idx++);
    }
    private static void inOrder(Node root, ArrayList<Integer> list){
        if(root == null) return;
        
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
        
    }
}