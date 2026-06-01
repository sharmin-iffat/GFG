class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int l = 0;
        int r = arr.length - 1;
        int maxArea = 0;
        
        while(l<r){
            int area = Math.min(arr[l], arr[r]) * (r-l);
            maxArea = Math.max(area, maxArea);
            
            if(arr[l] < arr[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }
}