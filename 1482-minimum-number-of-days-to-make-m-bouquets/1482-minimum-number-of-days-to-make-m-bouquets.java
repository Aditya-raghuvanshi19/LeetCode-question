class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        // Step 1: Check feasibility
        // If the total number of flowers needed (m * k) is more than the number of flowers available,
        // it's impossible to form m bouquets — return -1
        if ((long)m * k > bloomDay.length) return -1;

        // Step 2: Determine the binary search range
        // Find the earliest and latest blooming days in the bloomDay array
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            minDay = Math.min(minDay, day);
            maxDay = Math.max(maxDay, day);
        }

        // Binary search will happen between minDay and maxDay
        int low = minDay;
        int high = maxDay;

        // Step 3: Binary Search to find the minimum day required
        while (low <= high) {
            int mid = low+(high-low) / 2;  // Try this day as the candidate

            int flowersTogether = 0;  // Count of consecutive bloomed flowers
            int bouquets = 0;         // Number of bouquets formed

            // Step 4: Try to form bouquets with bloomDay <= mid (day)
            for (int day : bloomDay) {
                if (day <= mid) {
                    flowersTogether++;  // Flower has bloomed by 'mid' day

                    // If we get k adjacent bloomed flowers, make a bouquet
                    if (flowersTogether == k) {
                        bouquets++;
                        flowersTogether = 0;  // Reset for next bouquet
                    }
                } else {
                    flowersTogether = 0;  // Reset if any flower hasn't bloomed
                }

                // Optimization: break early if already enough bouquets
                if (bouquets == m) break;
            }

            // Step 5: Adjust binary search range based on bouquets formed
            if (bouquets >= m) {
                // Possible to form m bouquets by 'mid' day, try earlier
                high = mid - 1;
            } else {
                // Not enough bouquets, try a later day
                low = mid + 1;
            }
        }

        // Step 6: 'low' will point to the minimum day when it becomes possible
        return low;
    }
}
