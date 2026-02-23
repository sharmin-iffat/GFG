class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele: a){
            set.add(ele);
        }
        for(int ele: b){
            set.add(ele);
        }
        for(int ele: set){
            list.add(ele);
        }
        
        return list;
    }
}