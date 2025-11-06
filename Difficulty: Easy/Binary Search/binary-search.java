class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        if(arr == null || arr.length == 0) return -1;
        if(k < arr[0] || k > arr[arr.length-1]) return -1;
        
        int l = 0;
        int h = arr.length-1;
        
        while(l<=h){
            int mid = l + (h-l)/2;
            
            if(arr[mid] == k){
                if(mid == 0) return mid;
                else if(arr[mid-1] != arr[mid]){
                    return mid;
                }else{
                    h= mid-1;
                }
                
            } 
            
            else if(arr[mid] < k){
                l = mid +1;
            }else{
                h =  mid -1;
            }
        }
        return -1;
    }
}