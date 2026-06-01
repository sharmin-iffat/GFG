class Solution {
    public int findMaxProduct(int[] arr) {
        // code here
        long prod = 1;
        int zeroes=0, neg =0;
        int maxNeg = Integer.MIN_VALUE;
        long MOD = 1000000007L;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zeroes++;
            }else if(arr[i] <  0){
                neg++;
                maxNeg = Math.max(maxNeg, arr[i]);
            }
        }
        
        if(zeroes == arr.length) return 0;
        
        if(neg == 1 && neg + zeroes == arr.length && zeroes > 0) return 0;
        
        if(neg == 1 && arr.length == 1) return arr[0];
        
        
        boolean skipped = false;
        
        for(int i=0; i<arr.length; i++){
            if (arr[i] == 0) continue;
            
            if(neg % 2 == 1 && arr[i] == maxNeg && !skipped){
                skipped = true;
                continue;
                
            }
            prod = (prod * ((arr[i] % MOD + MOD) % MOD)) % MOD;
        }
        
        
        return (int)prod;
    }
}
