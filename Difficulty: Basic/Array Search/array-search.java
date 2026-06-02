class Solution {
    int exist(int[] arr, int x, int i){
        if(i==arr.length) return -1;
        if(arr[i] == x) return i;
        
        return exist(arr, x, i+1);
    }
    public int search(int arr[], int x) {
        // code here
        return exist(arr, x, 0);
    }
}
