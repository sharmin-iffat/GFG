/* Structure of linked list Node
class Node
{
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    int getKthFromLast(Node head, int k) {
        // code here
        int len =0;
        int m =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        if(k > len) return -1;
        else m = len -k;
        
        temp = head;
        
        for(int i=0; i<m; i++){
            temp = temp.next;
        }
        return temp.data;
    }
}