// User function Template for Java
class Solution {
    static int setBits(int n) {
        // code here
        String binary = Integer.toBinaryString(n);
        int count =0;
        
        for(int i=0; i<binary.length(); i++){
            
            if(binary.charAt(i) == '1') count++;
        }
        
        return count;
        
    }
}