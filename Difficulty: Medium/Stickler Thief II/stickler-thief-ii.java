class Solution {
    public int maxValue(int[] arr) {
        // code here
        int n = arr.length;
        int case1 = maxLoot(arr, 0, n-2);
        int case2 = maxLoot(arr, 1, n-1);
        
        return Math.max(case1, case2);
    }
    public int maxLoot(int[] arr, int start, int end) {
        // code here
        int len = end - start + 1;
        
        int[] dp = new int[len];
        
        dp[0] = arr[start];
        if(len > 1) dp[1] = Math.max(arr[start], arr[start+1]);
        
        for(int i = 2; i<len; i++){
            dp[i] = Math.max(dp[i-1], arr[start + i] + dp[i-2]);
        }
        return dp[len-1];
    }
}
