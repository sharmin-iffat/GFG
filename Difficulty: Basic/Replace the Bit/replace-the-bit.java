// User function Template for Java

class Solution {
    static int replaceBit(int N, int K) {
        
        int totalBits = (int)(Math.log(N) / Math.log(2)) + 1;
        
        // If K is out of range
        if (K > totalBits) {
            return N;
        }
        
        int rightPos = totalBits - K;
        
        // Clear the bit
        return N & ~(1 << rightPos);
    }
}