class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int ele:arr){
            pq.add(ele);
        }
        int cost =0;
        while(pq.size() > 1){
            int min1 = pq.remove();
            int min2 = pq.remove();
            int sum = min1 + min2;
            cost += sum;

            pq.add(sum);
        }
        return cost;
    }
}