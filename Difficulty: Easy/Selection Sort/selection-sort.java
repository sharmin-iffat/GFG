class Solution {
    void selectionSort(int[] arr) {
        // code here
       
        
        for(int i=0; i<arr.length-1; i++){
            int Min = Integer.MAX_VALUE;
            int minIdx = -1;
            
            for(int j=i; j<arr.length; j++){
                if(arr[j] < Min){
                    Min = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = Min;
            arr[minIdx] = temp;
        }
    }
}