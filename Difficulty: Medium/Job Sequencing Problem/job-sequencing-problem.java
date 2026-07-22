import java.util.*;

class Solution {
    int[] parent;

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {

        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < profit.length; i++) {
            int[] arr = {deadline[i], profit[i]};
            list.add(arr);
        }

        // Sort by profit in descending order
        Collections.sort(list, (a, b) ->
            Integer.compare(b[1], a[1])
        );

        int maxDeadline = 0;

        for (int[] job : list) {
            maxDeadline = Math.max(maxDeadline, job[0]);
        }

        // DSU parent array
        parent = new int[maxDeadline + 1];

        for (int i = 0; i <= maxDeadline; i++) {
            parent[i] = i;
        }

        int noJob = 0;
        int maxProfit = 0;

        for (int[] job : list) {

            int currDeadline = job[0];
            int currProfit = job[1];

            // Find latest available slot
            int availableSlot = find(currDeadline);

            if (availableSlot > 0) {

                noJob++;
                maxProfit += currProfit;

                // Mark this slot as occupied
                // Next available slot becomes availableSlot - 1
                parent[availableSlot] =
                        find(availableSlot - 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(noJob);
        ans.add(maxProfit);

        return ans;
    }

    // Find latest available slot
    private int find(int x) {

        if (parent[x] == x) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }
}