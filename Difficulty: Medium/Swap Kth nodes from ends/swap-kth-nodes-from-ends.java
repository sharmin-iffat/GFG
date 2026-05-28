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
    public Node swapKth(Node head, int k) {
        // code here
        
        Node temp = head;
        int len =0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
         
        if (k > len) return head;

        if (2 * k - 1 == len) return head;

        temp = head;
        for(int i=1; i<k; i++){
            temp = temp.next;
        }
        Node temp2 = head;
        for(int i=1; i<len-k+1; i++){
            temp2 = temp2.next;
        }
        
        int t = temp.data;
            temp.data = temp2.data;
            temp2.data = t;
            return head;
        
    }
}