class Solution {
    double pow(double b, long e){
        if(e==0) return 1;
        
        double call = pow(b, e/2);
        
        if(e % 2 == 0) return call * call;
        else return b * call * call;
    }
    double power(double b, int e) {
        // code here
        long n = e;
        if(n<0){
            b = 1/b;
            n = -e;
        }
        return pow(b, n);
    }
}