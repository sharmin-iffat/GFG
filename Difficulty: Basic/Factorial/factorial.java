class Solution {
    // Function to calculate factorial of a number.
    
    int factorial(int n) {
        // code here
        if(n==1 || n==0) return n;
        int prod = n * factorial(n-1);
        return prod;
    }
}
