import java.util.*;

class Solution {
    public static ArrayList<Integer> arrangeOddAndEven(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, -1));

        int evenIdx = 0, oddIdx = 1;
        List<Integer> extra = new ArrayList<>();

        // Place elements
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 && evenIdx < n) {
                res.set(evenIdx, arr[i]);
                evenIdx += 2;
            } else if (arr[i] % 2 != 0 && oddIdx < n) {
                res.set(oddIdx, arr[i]);
                oddIdx += 2;
            } else {
                extra.add(arr[i]); // store leftover
            }
        }

        // Fill remaining positions
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (res.get(i) == -1) {
                res.set(i, extra.get(k++));
            }
        }

        return res;
    }
}