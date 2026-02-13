class Solution {
    public static int gcd(int a, int b) {
        // code here
        // int min = Math.min(a,b);
        // int gcd =1;
        // for(int i=1; i<=min; i++){
        //     if(a % i == 0 && b % i == 0){
        //         gcd *= i;
        //     }
            
        // }
        // return gcd;
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
