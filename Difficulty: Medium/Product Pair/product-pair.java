class Solution {
    public boolean isProduct(int[] arr, long target) {
        // code here
        HashSet<Long> set = new HashSet<>();
        int prod =1;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                if(target == 0){
                    return true;
                }
                continue;
            }
            if(target % arr[i] == 0){
                long fact = target/arr[i];
                if(set.contains(fact)){
                return true;
            }
            set.add((long)arr[i]);
            }
        }
        return false;
    }
}