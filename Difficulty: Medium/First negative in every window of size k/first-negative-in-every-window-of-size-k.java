class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] < 0) q.add(i);
        }
        int i=0;
        int end = k-1;
        while(end < n){
            while(!q.isEmpty() && q.peek() < i) q.poll();
            
            if(!q.isEmpty() && q.peek() <= end) list.add(arr[q.peek()]);
            else {
                list.add(0);
                
            }    
            i++;
            end++;
        }
        return list;
        
    }
}