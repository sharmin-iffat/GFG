/* Structure of linked list Node
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
    Node removeDuplicates(Node head) {
        // code here
        if(head.next == null) return head;
        
        Node temp = head;
        
        while(temp != null && temp.next != null){
            while(temp.next != null && (temp.data == temp.next.data)){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }
}
