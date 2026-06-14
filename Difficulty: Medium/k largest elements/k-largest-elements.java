class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int ele : arr){
            pq.add(ele);
        }
        int a = arr.length - k;
        
        for(int i=1; i<=a; i++){
            pq.remove(pq.peek());
        }
        while(pq.size() != 0){
            list.add(pq.peek());
            pq.remove(pq.peek());
        }
        Collections.reverse(list);
        
        return list;
        
        
    }
}
