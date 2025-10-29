class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                list.add(arr[i]);
            }
        }
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        for(int i=list.size(); i<arr.length; i++){
            arr[i] = 0;
        }
        
        
    }
}