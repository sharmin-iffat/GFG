class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0; i<arr.length-1; i++){
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for(int j=i; j<arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[idx] = temp;
        }
    }
}