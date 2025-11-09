class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        int row = mat.length, col = mat[0].length;
        
        for(int i=0; i<col; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<row; j++){
                temp.add(mat[j][i]);
            }
            list.add(temp);
        }
        return list;
    }
}