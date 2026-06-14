class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        for(int ele:arr){
            pq.add(ele);
            
            if(pq.size() > k && i<arr.length){
               
                arr[i++] = pq.peek();
                pq.remove();
            } 
        }
         while (!pq.isEmpty()) {
            arr[i++] = pq.poll();
        }
    
    }
}
