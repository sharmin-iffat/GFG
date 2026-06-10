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
    
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        Stack<Node> st = new Stack<>();
        
        Node curr = root;
        
        
        while(st.size() > 0 || curr != null){
            if(curr != null){
                if(curr.left != null){
                    st.push(curr);
                    curr = curr.left;
                }else{
                   
                    list.add(curr.data);
                    curr = curr.right;
                }
            }
            else{
                curr = st.pop();
                list.add(curr.data);
                curr = curr.right;
            }
        }
        return list;
        
    }
}