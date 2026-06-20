class Solution {
    public int findUnique(int k, int[] arr) {
        // code here
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for(int ele:arr){
            mp.put(ele, mp.getOrDefault(ele, 0)+1);
            
        }
        int i=0;
        for(int key: mp.keySet()){
            if(mp.get(key) == 1){
                return key;
            }
        }
        //Arrays.sort(arr);
        return -1;
    }
}