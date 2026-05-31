/* structure of list node:

class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data=val;
        next=null;
    }
}

*/

class Solution {
    public Node findIntersection(Node head1, Node head2) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        Node temp = head2;
        
        Node dummy =new Node(-1);
        Node ans= dummy;
        
        while(temp != null){
            set.add(temp.data);
            temp = temp.next;
        }
        
        temp = head1;
        
        while(temp != null){
            if(set.contains(temp.data)){
                dummy.next = temp;
                dummy = dummy.next;
                set.remove(temp.data);
            }
            temp = temp.next;
            
        }
        dummy.next = null;
        return ans.next;
    }
}
     