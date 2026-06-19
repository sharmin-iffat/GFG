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
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        Node n1 = reverse(head1);
        Node n2 = reverse(head2);
        
        Node dummy = new Node(0);
        Node curr = dummy;
        int carry =0;
        
        while(n1 != null || n2 != null){
            int x = (n1!=null) ? n1.data : 0;
            int y = (n2!=null) ? n2.data : 0;
            int val = x + y + carry;
            carry = val/10;
            Node ans = new Node(val%10);
            curr.next = ans;
            curr = curr.next;
            if (n1 != null) n1 = n1.next;
            if (n2 != null) n2 = n2.next;
        }
        if(carry > 0){
            curr.next = new Node(carry);
        }
        Node temp = reverse(dummy.next);
        
        while(temp.data == 0 && temp.next != null){
            temp = temp.next;
        }
        return temp;
        
    
    }
    Node reverse(Node h){
        Node prev = null;
        Node curr = h;
        
        while(curr != null){
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        
        return prev;
    }
}
