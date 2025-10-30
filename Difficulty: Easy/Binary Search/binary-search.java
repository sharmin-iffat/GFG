class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int l =0; 
        int h = arr.length -1;
        int idx = -1;
        
        while(l<=h){
            int mid = l + (h-l)/2;
            
            if(arr[mid] == k){
                idx = mid;
                if(mid !=0 && arr[mid-1] < arr[mid] ) return idx;
                else if(mid == 0) return idx;
                else h = mid -1;
            }
            else if(arr[mid]>k){
                h = mid -1;
            }else{
                l= mid+1;
            }
        }
        return idx;
        
    }
}