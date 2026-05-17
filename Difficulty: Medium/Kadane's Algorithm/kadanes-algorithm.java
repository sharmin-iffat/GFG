class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int currSum = arr[0];
        int sum = arr[0];
        
        for(int i=1; i<arr.length; i++){
            currSum = Math.max(arr[i], currSum + arr[i]);
            sum = Math.max(currSum, sum);
        }
        return sum;
        
    }
}
