class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> list = new ArrayList<>();
        
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > Max){
                Max = arr[i];
            }
            if(arr[i]<Min){
                Min = arr[i];
            }
        }
        list.add(Min);
        list.add(Max);
        
        return list;
    }
}
