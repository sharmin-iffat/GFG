/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        int size1 = 0;
        Node temp = head1;
        
        while(temp != null){
            size1++;
            temp = temp.next;
        }
        
        int size2 = 0;
        temp = head2;
        
        while(temp != null){
            size2++;
            temp = temp.next;
        }
        
        Node h1 = head1;
        Node h2 = head2;
        
        if(size1 > size2){
            for(int i=0; i<size1-size2; i++){
                h1 = h1.next;
            }
        }else{
            for(int i=0; i<size2-size1; i++){
                h2 = h2.next;
            }
        }
        
        while(h1 != null && h2 != null){
            if(h1 == h2){
                return h1;
            }
            h1 = h1.next;
            h2 = h2.next;
        }
        return null;
    }
}