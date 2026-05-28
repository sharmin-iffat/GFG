/* Structure of linked list Node
class Node {
  public:
    int data;
    Node next;

    public Node(int x) {
        data = x;
        next = null;
    }
};
*/
class Solution {
    Node deleteAtPosition(Node head, int pos) {
        // code here
        
        if(head == null) return null;
        if(pos == 1) return head.next;
        
        Node temp =  head;
        
        for(int i=1; i<pos-1; i++){
            temp = temp.next;
        }
        if(temp == null || temp.next == null) {
            return head;
        }
    
        temp.next = temp.next.next;
        
        return head;
    }
}