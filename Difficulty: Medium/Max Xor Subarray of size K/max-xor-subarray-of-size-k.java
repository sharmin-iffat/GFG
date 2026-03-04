class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
       
        int n = arr.length;
        
        // Step 1: XOR of first k elements
        int currentXor = 0;
        for (int i = 0; i < k; i++) {
            currentXor ^= arr[i];
        }
        
        int maxXor = currentXor;
        
        // Step 2: Sliding window
        for (int i = k; i < n; i++) {
            // Remove left element
            currentXor ^= arr[i - k];
            
            // Add new element
            currentXor ^= arr[i];
            
            maxXor = Math.max(maxXor, currentXor);
        }
        
        return maxXor;
    }
}
