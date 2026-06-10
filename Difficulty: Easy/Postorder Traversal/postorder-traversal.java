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
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        Stack<Node> s = new Stack<>();
        
         
        s.push(root);
        
        while(s.size() > 0){
            
            Node curr = s.pop();
            list.add(curr.data);
            if(curr.left != null) s.push(curr.left);
            if(curr.right != null) s.push(curr.right);
            
        }
        Collections.reverse(list);
        
        return list;
    }
}