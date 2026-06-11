/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean search(Node root, int key) {
        // code here
        if(root.data == key) return true;
        
        Node temp = root;
        
        while(temp != null){
            if(temp.data == key) return true;
            
            if(temp.data < key){
                temp = temp.right;
            }else{
                temp = temp.left;
            }
            
        }
        return false;
    }
}