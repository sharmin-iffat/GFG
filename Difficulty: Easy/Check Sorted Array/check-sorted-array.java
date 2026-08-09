class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int n = arr.length;
        
        return helper(arr, n-1);
        
    }
    public boolean helper(int[] arr, int n) {
        // code here
        if(n == 0 || n==1) return true;
        
        
        return arr[n-1] >= arr[n-2] && helper(arr, n-1);
    }
}