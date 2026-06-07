// User function Template for Java

class Solution {
    public ArrayList<Integer> largestValues(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            int[] arr = new int[size];
            
            for(int i=0; i<size; i++){
                Node front = q.remove();
                
                arr[i] = front.data;
                
                if(front.left != null){
                    q.add(front.left);
                }
                if(front.right != null){
                    q.add(front.right);
                }
            }
            int max = Integer.MIN_VALUE;
            
            for(int i=0; i<arr.length; i++){
                if(max < arr[i]){
                    max = arr[i];
                }
            }
            list.add(max);
        }
        return list;
    }
}