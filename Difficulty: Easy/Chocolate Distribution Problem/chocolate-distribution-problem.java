class Solution {
    public int findMinDiff(int arr[], int m) {
        // code here
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        int i=0;
        int j=m-1;
        int diff =0;
        
        while(i<n && j<n){
            diff = arr[j] - arr[i];
            
            min = Math.min(diff, min);
            
            i++;
            j++;
        }
        return min;
    }
}