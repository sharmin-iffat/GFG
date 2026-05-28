/* Structure of a link list node
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
    Node divide(Node head) {
        // code here
        Node evenDummy = new Node(-1);
        Node oddDummy = new Node(-1);
        
        Node evenTail = evenDummy;
        Node oddTail = oddDummy;
        
        
        Node curr = head;
        
        while(curr != null){
            if(curr.data % 2 ==0){
                evenTail.next = curr;
                evenTail = evenTail.next;
            }else{
                oddTail.next = curr;
                oddTail = oddTail.next;
                
            }
            curr = curr.next;
        }
        evenTail.next = oddDummy.next;
        
        oddTail.next = null;
        
        return evenDummy.next;
    }
}