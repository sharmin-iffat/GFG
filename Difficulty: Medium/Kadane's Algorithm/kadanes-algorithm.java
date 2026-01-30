class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int currMax = arr[0];
        int max = arr[0];
        
        for(int i=1; i<arr.length; i++){
            currMax = Math.max(arr[i] , currMax + arr[i]);
            
            max = Math.max(max, currMax);
        }
        
        return max;
        
    }
}