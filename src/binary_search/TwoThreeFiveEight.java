package binary_search;

public class TwoThreeFiveEight {

    static class Solution {
    public int maximumGroups(int[] grades) {
    long length = grades.length;
    long high = length;
    long low = 1;
    long ans = 1;

    while(low <= high) {
        long mid = low + (high - low) / 2;

        long studentNeeded = (mid * (mid + 1)) / 2;

        if(studentNeeded <= length) {
            ans = mid;
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return (int) ans;
}
}

public static void main(String[] args) {
    Solution solver = new Solution();

    int[] grades1 = {10, 6, 12, 7, 3, 5};
    System.out.println("Test 1 Result: " + solver.maximumGroups(grades1));

    int[] grades2 = {8, 8};
    System.out.println("Test 2 Result: " + solver.maximumGroups(grades2));
}
}
