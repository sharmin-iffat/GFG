class Solution {
    public static int maximumElement(ArrayList<Integer> arr) {
        // Your code here
        int max =  Integer.MIN_VALUE;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) > max){
                max = arr.get(i);
            }
        }
        return max;
    }

    public static int minimumElement(ArrayList<Integer> arr) {
        // Your code here
        int min =  Integer.MAX_VALUE;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) < min){
                min = arr.get(i);
            }
        }
        return min;
    }
}
