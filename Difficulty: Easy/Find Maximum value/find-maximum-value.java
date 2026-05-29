class Solution {
    // Function to find the maximum product of any two adjacent elements in the array.
    public int maxValue(int[] arr) {
        // Your code goes here
        int i =0;
        int j = arr.length -1;
        int Max = Integer.MIN_VALUE;
        
        while(i<j){
           int curr = Math.abs(i-j) * Math.min(arr[j], arr[i]);
           
           Max = Math.max(curr, Max);
           
           if(arr[i]<arr[j]){
               i++;
           }else{
               j--;
           }
        }
        return Max;
    }
}