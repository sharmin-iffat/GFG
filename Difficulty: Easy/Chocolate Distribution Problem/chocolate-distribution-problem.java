// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;

        int i = 0;
        int j = m - 1;
        int n = arr.size();

        while (j < n && i < n) {
            int diff = arr.get(j) - arr.get(i);

            if (diff < min) {
                min = diff;
            }
            i++;
            j++;
        }

        return min;

    }
}