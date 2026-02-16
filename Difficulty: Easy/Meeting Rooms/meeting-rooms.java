class Solution {
    static boolean canAttend(int[][] arr) {
        // code here
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int row = arr.length;
        int col = arr[0].length;
        
        for(int i=1; i<row; i++){
            if(arr[i][0] < arr[i-1][1]) return false;
            
        }
        return true;
    }
}