package Patterns.KadanesAlgo;

public class OneOneEightSix {
    class Solution {
        public int maximumSum(int[] arr) {
            int noDeletion = arr[0];
            int oneDeletion = arr[0];
            int globalMax = arr[0];

            for(int i = 1; i < arr.length; i++)
            {
                int currNum = arr[i];
                int prevnoDeletion = noDeletion;

                noDeletion = Math.max(currNum, currNum + prevnoDeletion);
                oneDeletion = Math.max(prevnoDeletion, oneDeletion + currNum);

                globalMax = Math.max(globalMax,Math.max(noDeletion, oneDeletion));
            }
            return globalMax;
        }
    }
}
