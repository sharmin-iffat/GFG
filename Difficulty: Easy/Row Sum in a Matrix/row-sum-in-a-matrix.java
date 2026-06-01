class Solution {
    public static int[] rowSum(int mat[][]) {
        // Code here
        int col = mat.length;
        int row = mat[0].length;
        
        int[] arr = new int[col];
        
        for(int i=0; i<col; i++){
            int sum =0;
            for(int j=0; j<row; j++){
                sum +=mat[i][j];
            }
            arr[i] = sum;
        }
        return arr;
    }
}