class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        int[] count = new int[n + 1];
        ArrayList<Integer> list = new ArrayList<>();
        
        int dup =-1, miss=-1;
        
        for(int num:arr){
            count[num]++;
        }
        for(int i=1; i<=n; i++){
            if(count[i] == 2){
                dup = i;
            }else if(count[i] == 0){
                miss = i;
            }
        }
        list.add(dup);
        list.add(miss);
        return list;
    }
}
