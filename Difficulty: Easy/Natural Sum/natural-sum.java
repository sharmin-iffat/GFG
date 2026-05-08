// User function Template for Java

class Solution {
    public int find(int n) {
        // code here
        int count =0;
        int sum =0;
        for(int i=1; i<=n; i++){
            sum +=i;
            count++;
            if(sum == n){
                return count;
            }
        }
        return -1;
    }
}