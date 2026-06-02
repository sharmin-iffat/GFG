// User function Template for Java

class Solution {
    int sumOfSeries(int n) {
        // code here
        long ans = 0;

        for(int i = 1; i <= n; i++) {
            ans += (long)i * i * i;
        }
        return (int)(ans);
    }
}