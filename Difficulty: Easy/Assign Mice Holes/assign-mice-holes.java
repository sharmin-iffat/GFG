class Solution {
    public int assignHole(int[] mices, int[] holes) {
        // code here
        Arrays.sort(mices);
        Arrays.sort(holes);
        
        int ans = Integer.MIN_VALUE;
        
        for(int i=0; i<mices.length; i++){
            int curr = Math.abs(holes[i] - mices[i]);
            ans = Math.max(ans, curr);
        }
        return ans;
    }
};