class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int max = arr[0];
        int currmax = arr[0];
        
        for(int i=1; i<arr.length; i++){
            currmax = Math.max(arr[i], currmax + arr[i]);
            
            max = Math.max(max, currmax);
        }
        return max;
    }
}
