class Solution {
    int[] swap(int[] arr, int i, int j){
        if(i>j) return arr;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        return swap(arr, i+1, j-1);
    }
    
    public void reverseArray(int arr[]) {
        // code here
        swap(arr, 0, arr.length-1);
        
    }
}