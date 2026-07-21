class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
        
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            list.add(new int[]{start[i], finish[i]});
        }
        
        Collections.sort(list, (a, b) -> Integer.compare(a[1], b[1]));
        
        int total =0;
        int ending = -1;
        
        for(int i=0; i<n; i++){
            int currStart = list.get(i)[0];
            int currEnd = list.get(i)[1];
            
            if(currStart > ending){
                total++;
                ending = currEnd;
            }
        }
        return total;
    }
}
