class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int[] ans = new int[2];
        int OCount = 0;
        int ECount = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0) ECount++;
            else OCount++;
        }
        ans[0] = OCount;
        ans[1] = ECount;
        return ans;
    }
}