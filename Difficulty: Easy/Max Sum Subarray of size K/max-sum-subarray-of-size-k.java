class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int i =0;
        int sum =0;
        int maxSum = 0;
        while(i<k){
            sum += arr[i];
            i++;
        }
        maxSum = sum;
        
        for(int j=1; j<arr.length-k+1; j++){
            sum = sum - arr[j-1] + arr[j+k-1];
            
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
