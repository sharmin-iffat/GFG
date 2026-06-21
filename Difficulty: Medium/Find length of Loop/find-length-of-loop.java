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
    public int lengthOfLoop(Node head) {
        // code here
        Node fast = head;
        Node slow = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow){
                int count = 1;
                slow = slow.next;
                while(fast != slow){
                    count++;
                    slow = slow.next;
                }
                return count;
            }
        }
        return 0;
    }
}