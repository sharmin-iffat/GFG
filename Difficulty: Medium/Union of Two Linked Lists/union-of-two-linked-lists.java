/*

class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }

}
*/
class Solution {
    public Node makeUnion(Node head1, Node head2) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        Node temp = head1;
        
        while(temp != null){
            set.add(temp.data);
            temp = temp.next;
        }
        
        temp = head2;
        
        while(temp != null){
            set.add(temp.data);
            temp = temp.next;
        }
        
        Node dummy = new Node(-1);
        Node ans = dummy;
        
        temp = head1;
        
        while(temp != null ){
            if(set.contains(temp.data)){
                dummy.next = temp;
                dummy = dummy.next;
                set.remove(temp.data);
            }
            temp = temp.next;
        }
        
        temp = head2;
        
         while(temp != null ){
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