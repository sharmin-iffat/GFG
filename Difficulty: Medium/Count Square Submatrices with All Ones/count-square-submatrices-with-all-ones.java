class Solution {
    public int countSquares(int[][] mat) {
        // code here
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;
        
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(mat[i][j] != 0){
                    mat[i][j] = mat[i][j] + Math.min(mat[i][j-1], Math.min(mat[i-1][j], mat[i-1][j-1]));
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                count += mat[i][j];
            }
        }
        return count;
    }
}