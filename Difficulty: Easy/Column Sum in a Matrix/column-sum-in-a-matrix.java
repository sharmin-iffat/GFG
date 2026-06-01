class Solution {
    public static int[] colSum(int mat[][]) {
        // Code Here
        int row = mat.length;
        int col = mat[0].length;
        
        
        int[] arr = new int[col];
        
        for(int j = 0; j < col; j++) {
            int sum = 0;

            for(int i = 0; i < row; i++) {
                sum += mat[i][j];
            }

            arr[j] = sum;
        }
        return arr;
    }
}
