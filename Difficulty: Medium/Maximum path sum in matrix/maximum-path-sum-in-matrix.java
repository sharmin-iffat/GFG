class Solution {
    public int maximumPath(int[][] mat) {
        // code here
        int m = mat.length;
        int n = mat[0].length;
        int[][] dp = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0) dp[i][j] = mat[i][j];
                else{
                    int leftDiag = (j > 0) ? dp[i - 1][j - 1] : Integer.MIN_VALUE;

                    int rightDiag = (j < n - 1) ? dp[i - 1][j + 1] : Integer.MIN_VALUE;
                    
                    dp[i][j] = mat[i][j] + Math.max(dp[i-1][j], Math.max(leftDiag, rightDiag));
                }
            }
        }
        
        int ans = Integer.MIN_VALUE;
        for(int j=0; j<n; j++){
            ans = Math.max(ans, dp[m-1][j]);
        }
        return ans;
    }
}