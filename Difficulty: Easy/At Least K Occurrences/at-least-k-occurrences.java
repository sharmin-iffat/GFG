class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // write code
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for(int i=0; i<arr.length-1; i++){
            int num = arr[i];
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            }else{
                mp.put(arr[i], 1);
            }
            
            if(mp.get(arr[i]) >= k){
                return arr[i];
            }
        }
        return -1;
    }
}