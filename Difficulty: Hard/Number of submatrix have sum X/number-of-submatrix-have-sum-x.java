class Solution {
    public int countSquare(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        // 1-indexed prefix sum for easier boundary handling
        long[][] pref = new long[n + 1][m + 1];
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                pref[i][j] = mat[i-1][j-1] 
                           + pref[i-1][j] 
                           + pref[i][j-1] 
                           - pref[i-1][j-1];
            }
        }
        
        int count = 0;
        int maxSide = Math.min(n, m);
        
        // Iterate through all possible square side lengths
        for (int s = 1; s <= maxSide; s++) {
            // Iterate through all possible top-left corners (i, j)
            for (int i = 1; i <= n - s + 1; i++) {
                for (int j = 1; j <= m - s + 1; j++) {
                    int r2 = i + s - 1;
                    int c2 = j + s - 1;
                    
                    // Calculate sum of square in O(1)
                    long currentSum = pref[r2][c2] 
                                    - pref[i-1][c2] 
                                    - pref[r2][j-1] 
                                    + pref[i-1][j-1];
                    
                    if (currentSum == x) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}
    