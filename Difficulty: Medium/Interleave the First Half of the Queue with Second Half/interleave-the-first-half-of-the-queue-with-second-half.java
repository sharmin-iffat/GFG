class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer> qt = new LinkedList<>();
        int hSize = q.size()/2;
        while(hSize > 0){
            qt.add(q.poll());
            hSize--;
        }
        while(!qt.isEmpty()){
            q.add(qt.poll());
            q.add(q.poll());
        }
    }
}
