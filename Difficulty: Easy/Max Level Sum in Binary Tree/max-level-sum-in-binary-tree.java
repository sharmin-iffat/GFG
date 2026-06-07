/*Complete the finction below
Node is as follows
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/
class Solution {
    public int maxLevelSum(Node root) {
        // add code here.
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        int max = Integer.MIN_VALUE;
        
        while(!q.isEmpty()){
            int size = q.size();
            int sum =0;
            
            for(int i=0; i<size; i++){
                Node front = q.remove();
                
                sum += front.data;
                
                if(front.left != null){
                    q.add(front.left);
                }
                if(front.right != null){
                    q.add(front.right);
                }
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}