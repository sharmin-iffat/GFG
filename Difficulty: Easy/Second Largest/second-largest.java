class Solution {
    public int firstLargest(int[] arr){
        int max = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public int getSecondLargest(int[] arr) {
        // code here
        int max = firstLargest(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
                
            }
        }
        int secondLargest = firstLargest(arr);
        return secondLargest;
        
        
        
    }
}