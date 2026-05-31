class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        int n= arr.length;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<k; i++){
            max = Math.max(max, arr[i]);
            q.add(arr[i]);
        }
        list.add(max);
        
        for(int i=k; i<n; i++){
            if(max == q.peek()){
                q.poll();
                max = Integer.MIN_VALUE;
                q.add(arr[i]);
                
                for(int j=0; j<k; j++){
                    if(max < q.peek()){
                        max = q.peek();
                    }
                    q.add(q.poll());
                }
            }else{
                q.poll();
                if(max < arr[i]){
                    max = arr[i];
                }
                q.add(arr[i]);
            }
            
            list.add(max);
        }
        
        return list;
        
    }
}