
class Solution {
    public long findMax(int[] arr){
        long max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    
     public long findMin(int[] arr){
        long min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    

    public long minMaxProduct(int[] arr1, int[] arr2) {
        // code here
        long max = findMax(arr1);
        long min = findMin(arr2);
        
        return max*min;
        
    }
}