class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int n= arr.length;
        int current = arr[n-1];
        list.add(current);
        
        for(int i = n-2; i>=0; i--){
            if(arr[i] >= current){
                current = arr[i];
                list.add(current);
            }
        }
        
        int l = 0;
        int r = list.size()-1;
        
        while(l<r){
            int temp = list.get(l);
            list.set(l, list.get(r));
            list.set(r, temp);
            
            l++;
            r--;
        }
        
        return list;
    }
}
