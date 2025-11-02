// User function Template for Java
class Solution {
    public ArrayList<Integer> firstAndLast(int x, int arr[]) {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int firstIdx = findFirst(x, arr);
        int lastIdx = findLast(x, arr);
        
        if(firstIdx == -1){
            list.add(-1);
        }else{
            list.add(firstIdx);
            list.add(lastIdx);
        }
        return list;
    }
    int findFirst(int x, int[] arr){
        int l=0, h=arr.length-1;
        int res =-1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid] == x){
                res= mid;
                h = mid-1;
            }else if(arr[mid] < x){
                l = mid +1;
            }else{
                h = mid-1;
            }
        }
        return res;
    }
    int findLast(int x, int[] arr){
        int l=0, h=arr.length-1;
        int res =-1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid] == x){
                res= mid;
                l = mid+1;
            }else if(arr[mid] < x){
                l = mid +1;
            }else{
                h = mid-1;
            }
        }
        return res;
    }
}
