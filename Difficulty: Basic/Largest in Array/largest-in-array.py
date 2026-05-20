class Solution:
    def largest(self, arr):
        # code here
        max_val = float('-inf')
        
        for i in range(0, len(arr)):
            if max_val < arr[i]:
                max_val = arr[i]
        
        return max_val        
        
