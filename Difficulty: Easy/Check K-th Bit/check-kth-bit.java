class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        int shift = n>>k;
        
        if(shift % 2 != 0) return true;
        
        else return false;
    }
}