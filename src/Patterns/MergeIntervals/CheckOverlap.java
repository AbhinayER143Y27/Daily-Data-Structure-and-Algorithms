package Patterns.MergeIntervals;

import java.util.Arrays;

public class CheckOverlap {

    public boolean checkOverlap(int[][] intervals) {
       if(intervals == null || intervals.length <= 1)
       {
           return false;
       }

       Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

       for(int i = 1; i < intervals.length; i++)
       {
           int previousEnd = intervals[i - 1][1];
           int currentstart = intervals[i][0];

           if(previousEnd >= currentstart)
           {
               return true;
           }
       }
       return false;
    }

    public static void main(String[] args) {
        CheckOverlap solver = new CheckOverlap();

        System.out.println("=== OVERLAPPING INTERVALS TEST SUITE ===");

        // Test Case 1: Overlap exists
        int[][] intervals1 = {{1, 3}, {5, 7}, {2, 4}, {6, 8}};
        System.out.println("Test 1 Output: " + solver.checkOverlap(intervals1) + " (Expected: true)");

        // Test Case 2: No overlap
        int[][] intervals2 = {{1, 3}, {7, 9}, {4, 6}, {10, 13}};
        System.out.println("Test 2 Output: " + solver.checkOverlap(intervals2) + " (Expected: false)");

        // Test Case 3: Exact edge touch (Depends on problem rules, usually considered an overlap)
        int[][] intervals3 = {{1, 3}, {3, 5}};
        System.out.println("Test 3 Output: " + solver.checkOverlap(intervals3) + " (Expected: true)");
    }
}