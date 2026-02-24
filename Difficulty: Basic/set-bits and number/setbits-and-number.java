// User function Template for Java

class Solution {
    static int bitMultiply(int N) {
        // coe here
        String binary = Integer.toBinaryString(N);
        int count =0;
        
        for(int i=0; i<binary.length(); i++){
            
            if(binary.charAt(i) == '1') count++;
        }
        
        
        return N * count;
    }
}