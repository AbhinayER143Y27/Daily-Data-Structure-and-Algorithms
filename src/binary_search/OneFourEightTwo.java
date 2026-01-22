package binary_search;

public class OneFourEightTwo {

    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
        // Edge Case: If we need more flowers than we have, impossible.
        if (val > bloomDay.length) return -1;

        // Find range for Binary Search
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int ans = -1; // Default to -1 if not found

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canMakeBouquets(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1; // Try to do it in fewer days
            } else {
                low = mid + 1; // Need more time for flowers to bloom
            }
        }
        return ans;
    }

    // Helper: Can we make 'm' bouquets of 'k' adjacent flowers on 'day'?
    private boolean canMakeBouquets(int[] bloomDay, int day, int m, int k) {
        int bouquets = 0;
        int count = 0; // Tracks consecutive blooming flowers

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                count++;
            } else {
                // Flower not bloomed, streak broken!
                // Calculate how many bouquets we made from that streak
                bouquets += (count / k);
                count = 0; // Reset streak
            }
        }
        // Don't forget the last streak after loop ends
        bouquets += (count / k);

        return bouquets >= m;
    }

    public static void main(String[] args) {
        OneFourEightTwo solver = new OneFourEightTwo();

        // Example: Need 3 bouquets, each needs 1 flower
        int[] bloomDay = {1, 10, 3, 10, 2};
        System.out.println("Min Days: " + solver.minDays(bloomDay, 3, 1)); // Expected: 3

        // Example: Need 3 bouquets, each needs 2 flowers
        int[] bloomDay2 = {1, 10, 3, 10, 2};
        System.out.println("Min Days: " + solver.minDays(bloomDay2, 3, 2)); // Expected: -1 (Impossible)
    }
}