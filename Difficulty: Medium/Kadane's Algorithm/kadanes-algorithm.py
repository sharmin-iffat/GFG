class Solution:
    def maxSubarraySum(self, arr):
        # Code here
        maxSum =arr[0]
        currMax =arr[0]
        
        for i in range(1, len(arr)):
            currMax = max(arr[i], currMax + arr[i])
            
            maxSum = max(maxSum, currMax) 
        
        return maxSum
        
        
        