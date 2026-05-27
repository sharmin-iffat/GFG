/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        Node temp = head;
        int len =0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        if(len < index) return -1;
        
        temp= head;
        
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        return temp.data;
    }
}