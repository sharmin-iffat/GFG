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
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> list = new ArrayList<>();
        
        Stack<Node> s = new Stack<>();
        
         
        s.push(root);
        
        while(s.size() > 0){
            
            Node curr = s.pop();
            list.add(curr.data);
            if(curr.right != null) s.push(curr.right);
            if(curr.left != null) s.push(curr.left);
        }
        
        return list;
    }
}