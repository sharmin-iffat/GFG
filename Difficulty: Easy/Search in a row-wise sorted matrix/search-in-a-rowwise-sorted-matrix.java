

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int col = mat.length; 
        int row = mat[0].length;
        
        for(int i=0; i<col; i++){
            int j = row-1;
            while(j>=0){
                if(mat[i][j] == x) return true;
                
                else if(mat[i][j] > x) j--;
                else break;
            }
        }
        return false;
    }
}
