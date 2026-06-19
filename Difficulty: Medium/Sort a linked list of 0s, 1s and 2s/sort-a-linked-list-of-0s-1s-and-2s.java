/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int zeroes = 0;
        int once = 0;
        int twos = 0;
        
        Node temp = head;
        
        while(temp != null){
            if(temp.data == 0) zeroes++;
            else if(temp.data == 1) once++;
            else twos++;
            temp = temp.next;
        }
        
        temp = head;
        while(temp != null){
            if(zeroes != 0){
                temp.data = 0;
                zeroes--;
            }else if(once != 0){
                temp.data = 1;
                once--;
            }else{
                temp.data = 2;
                twos--;
            }
            temp = temp.next;
        }
        return head;
    }
    
}