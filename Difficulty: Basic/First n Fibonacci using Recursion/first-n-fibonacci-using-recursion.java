// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
     
    static int fib(int n){
        if(n==0 || n==1) return n;
        
        return fib(n-1) + fib(n-2);
    
    }
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = fib(i);
        }
        
        return arr;
    }
}