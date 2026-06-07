/* Structure of a Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
};
*/
class Solution {
    
    public int maxNodeLevel(Node root) {
        // code here
       Queue<Node> q = new LinkedList<>();
        
        if(root == null) return 0;
        
        int level = 0;
        int currLevel = 0;
        
        q.add(root);
        
        int max = Integer.MIN_VALUE;
        
        while(!q.isEmpty()){
            
            int size = q.size();
            if(max < size){
                max = size;
                level = currLevel;
            }
            
            for(int i=0; i<size; i++){
                Node front = q.remove();
                
                if(front.left != null){
                    q.add(front.left);
                }
                
                if(front.right != null){
                    q.add(front.right);
                }
            }
            currLevel++;
        }
        
        return level;
    }
}