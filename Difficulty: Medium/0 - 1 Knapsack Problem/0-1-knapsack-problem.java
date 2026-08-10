class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = wt.length;
       
        int[][] dp = new int[n][W + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        
        return helper(W, val, wt, n-1, dp);
        
    }
    public int helper(int W, int val[], int wt[], int i, int[][] dp) {
        // code here
        if(i < 0 || W == 0){
            return 0;
        }
        if(dp[i][W] != -1) return dp[i][W];
        if(W >= wt[i]){
            int pick = val[i] + helper(W-wt[i], val, wt, i-1, dp);
            int skip = helper(W, val, wt, i-1, dp);
            return dp[i][W] = Math.max(pick, skip);
            
        }else{
            return dp[i][W] = helper(W, val, wt, i-1, dp);
        }
    }
}