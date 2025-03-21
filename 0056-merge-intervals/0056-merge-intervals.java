class Solution {
     public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        
        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        for (int[] interval : intervals) {
            // If list is empty or non-overlapping interval, add new interval
            if (ans.isEmpty() || interval[0] > ans.get(ans.size() - 1)[1]) {
                ans.add(interval);
            } else {
                // Merge overlapping intervals
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
            }
        }
        
        return ans.toArray(new int[ans.size()][]);
    }
}