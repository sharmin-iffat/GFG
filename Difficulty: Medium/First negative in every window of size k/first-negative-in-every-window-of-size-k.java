class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        int n = arr.length;
        int i=0;
        for(i=0; i<k; i++){
            if(arr[i] < 0){
                q.add(arr[i]);
            }
        }
        if(!q.isEmpty()) list.add(q.peek());
        else list.add(0);
        
        int start =0;
        
        while(i<n){
            if(!q.isEmpty() && arr[start] == q.peek()){
                q.poll();
            }
            if(arr[i] < 0) q.add(arr[i]);
            
            if(q.isEmpty()) list.add(0);
            
            else list.add(q.peek());
            
            i++;
            start++;
        }
        return list;
    }
}
