class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            // already sorted
            if (arr[low] <= arr[high]) {
                return low;
            }

            int mid = low + (high - low) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            // mid is minimum
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }

            // left part sorted → go right
            if (arr[mid] >= arr[low]) {
                low = mid + 1;
            }
            // right part sorted → go left
            else {
                high = mid - 1;
            }
        }
        return 0;
    }
}