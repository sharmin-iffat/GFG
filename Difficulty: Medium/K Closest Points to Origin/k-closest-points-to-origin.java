class Triplets implements Comparable<Triplets> {
    int dis;
    int x;
    int y;
    
    Triplets(int dis, int x, int y){
        this.dis = dis;
        this.x = x;
        this.y = y;
    }
    public int compareTo(Triplets t){
        return this.dis - t.dis;
    }
}




class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
        PriorityQueue<Triplets> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int[] point : points){
            int x = point[0], y = point[1];
            int dis =  x*x + y*y;
            
            pq.add(new Triplets(dis, x, y));
            
            if(pq.size() > k) pq.remove();
            
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i=0; i<k; i++){
            ArrayList<Integer> list =  new ArrayList<>();
            Triplets top = pq.remove();
            list.add(top.x);
            list.add(top.y);
            ans.add(list);
        }
        return ans;
    }
}