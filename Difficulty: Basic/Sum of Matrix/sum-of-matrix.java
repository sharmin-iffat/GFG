class Solution {
    public int sumOfMatrix(int[][] mat) {
        // code here
        int col = mat.length;
        int row = mat[0].length;
        int sum =0;
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                sum +=mat[i][j];
            }
        }
        return sum;
    }
}