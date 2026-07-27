package Revision;

import java.util.Arrays;

public class TripletWithSmallerSum {
    class Solution {
        int countTriplets(int sum, int arr[]) {
            int counter = 0;
            if(arr == null || arr.length < 2)
            {
                return counter;
            }
            Arrays.sort(arr);
            for(int anchor = 0; anchor < arr.length - 2; anchor++)
            {
                int left = anchor + 1, right = arr.length - 1;
                while(left < right){
                    long currentSum = (long)arr[anchor] + arr[left] + arr[right];
                    if(currentSum < (long)sum)
                    {
                        counter += right - left;
                        left++;
                    }
                    else
                    {
                        right--;
                    }
                }
            }
            return counter;
        }
    }
}
