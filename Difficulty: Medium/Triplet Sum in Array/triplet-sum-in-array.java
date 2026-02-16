class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++){
            int l = i+1;
            int r = arr.length-1;
            int sum =0;
            while(l<r){
                sum = arr[i] + arr[l] + arr[r];
                
                if(sum==target) return true;
                else if(sum < target) l++;
                else r--;
            }
            
        }
        return false;
    }
}
