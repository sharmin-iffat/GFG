// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int firstIdx = findFirst(arr, x);
        int LastIdx = findLast(arr, x);
        list.add(firstIdx);
        list.add(LastIdx);
        
        return list;
    }
    
    int findFirst(int[] arr, int x){
        int l = 0;
        int h = arr.length-1;
        int idx=-1;
        
        while(l<=h){
            int mid = l + (h -l)/2;
            
            if(arr[mid] == x){
                idx = mid;
                h = mid -1;
            }else if(arr[mid] < x){
                l = mid +1;
            }else{
                h = mid -1;
            }
        }
        return idx;
    }
    int findLast(int[] arr, int x){
        int l = 0;
        int h = arr.length-1;
        int idx=-1;
        while(l<=h){
            int mid = l + (h -l)/2;
            
            if(arr[mid] == x){
                idx = mid;
                l = mid +1;
            }else if(arr[mid] < x){
                l = mid +1;
            }else{
                h = mid -1;
            }
        }
        return idx;
    }
}
