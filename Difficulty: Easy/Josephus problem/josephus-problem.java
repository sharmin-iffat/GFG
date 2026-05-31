class Solution {
    public int josephus(int n, int k) {
        // code here
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=1; i<=n; i++){
            q.add(i);
        }
        
        while(q.size() > 1){
            for(int i=0; i<k-1; i++){
                q.add(q.poll());
            }
            q.poll();
        }
        return q.peek();
    }
}