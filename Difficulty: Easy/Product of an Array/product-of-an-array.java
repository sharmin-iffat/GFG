/*
     arr[] is the array
*/
class Solution {
    public static long product(long arr[]) {
        // your code here
        int MOD = 1000000007;
        long prod = 1;
        
        for(int i=0; i<arr.length; i++){
            prod = (prod * arr[i]) % MOD;
        }
        
        return prod;
    }
}