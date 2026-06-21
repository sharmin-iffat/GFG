class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int lo = 0, hi = arr.length-1;
        
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            
            if(arr[mid] == k){
                if(arr[mid] == k && mid == 0) return mid;
                if(arr[mid-1] != arr[mid]) return mid;
                else{
                    hi = mid -1;
                }
            }else if(arr[mid] > k){
                hi = mid -1;
            }else{
                lo = mid + 1;
            }
        }
        return -1;
    }
}