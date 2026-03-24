package binary_search;

public class SevenFour {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int Rows = matrix.length;
            int Columns = matrix[0].length;

            int low = 0;
            int high = (Rows * Columns) - 1;

            while(low <= high)
            {
                int mid = low + (high - low)/2;

                int row = mid/Columns;
                int col = mid%Columns;

                int midValue = matrix[row][col];

                if(midValue == target)
                {
                    return true;
                }
                else if(midValue > target)
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            return false;
        }
    }
}
