/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        Node t = new Node(val);
        
        if(pos == 1){
            t.next = head;
            return t;
        }
        Node temp = head;
        
        for(int i=1; i<pos-1 && temp != null; i++){
            temp = temp.next;
        }
        if(temp ==  null) return head;
        t.next = temp.next;
        temp.next = t;
        
        return head;
    }
}