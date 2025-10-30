class Solution {
    public int peakElement(int[] arr) {
        // code here
        int l=0, h=arr.length -1;
        
        while(l<=h){
            int mid = l + (h-l)/2;
            
            if((mid == 0 || arr[mid-1] < arr[mid]) && (mid == arr.length-1 || arr[mid+1] < arr[mid])){
                return mid;
            }else if(mid < arr.length - 1 && arr[mid] < arr[mid + 1]){
                l = mid +1;
            }else{
                h = mid -1;
            }
        }
        return -1;
    }
}