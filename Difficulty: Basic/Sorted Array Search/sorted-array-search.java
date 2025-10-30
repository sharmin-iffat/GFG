class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        
        
        int l=0, h = arr.length-1;
        
        while(l<=h){
            int mid = l + (h-l)/2;
            
            if(arr[mid] == k) return true;
            
            else if(arr[mid]> k) h = mid-1;
            
            else l = mid+1;
            
        }
        
        return false;
        
    }
}