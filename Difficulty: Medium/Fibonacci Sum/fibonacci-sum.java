// User function Template for Java
class Solution {
    public int fibSum(int n) {
        // code here
        long mod = 1000000007;
        long sum =0;
        
        long a = 0, b = 1;

        for (int i = 0; i <= n; i++) {
            sum += a;

            long c = (a + b)%mod;
            a = b;
            b = c;
        }
        
        return (int)(sum%mod);
    }
}