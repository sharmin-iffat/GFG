/* Structure of linked list Node
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
    
    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next; // save next node
            curr.next = prev;      // reverse link
            prev = curr;           // move prev forward
            curr = next;           // move curr forward
        }

        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        if(head == null) return null;
        if(head.next == null){
            if(head.data >= 9){
                head.data = 1;
                head.next = new Node(0);
            }else{
                head.data += 1;
            }
            
            return head;
        }
        head = reverse(head);
        Node temp = head;
        int carry =0;
        
        if(temp.data == 9){
            temp.data = 0;
            carry = 1;
            temp = temp.next;
            while(temp != null){
                int sum = temp.data + carry;
                
                if(sum >= 10){
                    temp.data = 0;
                    carry = 1;
                }else{
                    temp.data = sum;
                    carry = 0;
                    break;
                }
                
                if (temp.next == null && carry > 0) {
                    temp.next = new Node(1);
                    carry = 0;
                    break;
                }
                
                temp = temp.next;
            }
        
        }else{
            temp.data +=1;
        }
        head = reverse(head);
        
        return head;
    }
}