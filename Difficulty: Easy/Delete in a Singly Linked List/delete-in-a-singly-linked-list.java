/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        Node temp = head;
        if(x == 1) head = head.next;
        for(int i=1; i<x-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
        return head;
    }
}