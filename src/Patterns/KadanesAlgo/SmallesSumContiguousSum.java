package Patterns.KadanesAlgo;

public class SmallesSumContiguousSum {
    // User function Template for Java

    class Something {
        static int smallestSumSubarray(int a[], int size) {
            int currentSum = a[0];
            int minSum = a[0];

            for(int i = 1; i < a.length; i++)
            {
                currentSum = Math.min(currentSum + a[i], a[i]);

                minSum  = Math.min(currentSum, minSum);
            }
            return minSum;
        }
    }
}
