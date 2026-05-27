/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node t =  new Node(x);
        if(head == null) return t;
        Node temp = head;
        
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = t;
        return head;
    }
}