class Solution {
    public void sort012(int[] arr) {
        // code here
        int noOfZeroes = 0;
        int noOfOnces = 0;
        int noOfTwos = 0;
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            if(arr[i] == 0) noOfZeroes++;
            else if(arr[i] == 1) noOfOnces++;
            else noOfTwos++;
        }
        
        for(int i=0; i<n; i++){
            if(i<noOfZeroes) arr[i] = 0;
            else if(i>=noOfZeroes && i<noOfOnces + noOfZeroes) arr[i] = 1;
            else arr[i] = 2;
        }
        
    }
}