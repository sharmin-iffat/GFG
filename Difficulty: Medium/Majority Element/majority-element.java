class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer, Integer> mp = new HashMap<>();

        
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            mp.put(key, mp.getOrDefault(key,0)+1);
        }
        
        for(int key:mp.keySet()){
            if(mp.get(key)>n/2){
                return key;
            }
        }
        return -1;
    }
}