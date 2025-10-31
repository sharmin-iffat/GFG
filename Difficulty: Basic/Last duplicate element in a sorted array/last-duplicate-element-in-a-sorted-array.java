// User function Template for Java

class Solution {
    public int[] dupLastIndex(int[] arr) {
        // Complete the function
        int[] result = {-1, -1};
        
        for(int i=arr.length-1; i>0; i--){
            if(arr[i] == arr[i-1]){
                result[0] = i;
                result[1] = arr[i];
                
                return result;
            }
        }
        return result;
    }
}
