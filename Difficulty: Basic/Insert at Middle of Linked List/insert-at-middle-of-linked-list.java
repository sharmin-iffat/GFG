/* Structure of a linked list node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // code here
        Node t = new Node(x);
        if(head == null) return t;
        Node slow = head;
        Node fast = head;
        
        while(fast.next!= null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        t.next = slow.next;
        slow.next = t;
        
        return head;
    }
}