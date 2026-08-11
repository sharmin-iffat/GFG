class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        Boolean[][] memo = new Boolean[n][sum+1];
        return helper(arr, sum, 0, memo);
    }
    private static boolean helper(int arr[], int sum, int i, Boolean[][] memo) {
        // code here
        if(sum == 0) return true;
        
        if(i == arr.length) return false;
        
        if (memo[i][sum] != null) {
            return memo[i][sum];
        }
        
        if(sum >= arr[i]){
            boolean pick = helper(arr, sum-arr[i], i+1, memo);
            boolean skip = helper(arr, sum, i+1, memo);
            return memo[i][sum] = pick || skip;
        }else{
            return memo[i][sum] = helper(arr, sum, i+1, memo);
        }
    }
}
