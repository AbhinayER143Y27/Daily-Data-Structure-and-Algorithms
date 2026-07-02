package Patterns.MergeIntervals;

import java.util.Arrays;

public class MeetingRooms {

    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        int n = intervals.length;
        int[] starts = new int[n];
        int[] ends = new int[n];

        int rooms = 0;
        int maxRooms = 0;

        for(int i = 0; i < n; i++)
        {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int s = 0; // for the starts pointer.
        int e = 0; // for the ends pointer.

        // 3. The Chronological Scanner
        while (s < n) {
            // Compare the next start time to the next end time.

            if(starts[s] < ends[e])
            {
                rooms++;
                s++;
            }
            else
            {
                rooms--;
                e++;
            }
            maxRooms = Math.max(rooms,maxRooms);
        }

        return maxRooms;
    }

    public static void main(String[] args) {
        MeetingRooms solver = new MeetingRooms();

        System.out.println("=== MINIMUM MEETING ROOMS TEST SUITE ===");

        // Test 1: Standard overlap
        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println("Test 1: " + solver.minMeetingRooms(intervals1) + " (Expected: 2)");

        // Test 2: No overlap
        int[][] intervals2 = {{7, 10}, {2, 4}};
        System.out.println("Test 2: " + solver.minMeetingRooms(intervals2) + " (Expected: 1)");

        // Test 3: Touch edges (Meeting ends exactly when another begins)
        int[][] intervals3 = {{1, 5}, {5, 10}, {10, 15}};
        System.out.println("Test 3: " + solver.minMeetingRooms(intervals3) + " (Expected: 1)");
    }
}
