/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        // code here
        int len = 0;
        
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        return len;
    }
}