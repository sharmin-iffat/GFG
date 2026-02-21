class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int maxH = 0;
        
        for (int i = 0; i < n; i++) {
            int h = Math.min(citations[i], n - i);
            maxH = Math.max(maxH, h);
        }
        
        return maxH;
    }
}