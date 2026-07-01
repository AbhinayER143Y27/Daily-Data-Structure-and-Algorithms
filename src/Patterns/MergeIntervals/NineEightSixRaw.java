//package Patterns.MergeIntervals;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class NineEightSix {
//    class Solution {
//        public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
//            int i = 0, j = 0;
//            List<int[]> ans = new ArrayList<>();
//
//            while(i < firstList.length && j < secondList.length)
//            {
//                int start1 = firsList[i][0];
//                int end1 = firstList[i][1];
//                int start2 = secondList[j][0];
//                int end2 = firstList[j][1];
//                if(start1 <= start2)
//                {
//                    if(start2 <= end1)
//                    {
//                        int start = Math.max(start1 , start2);
//                        int end = Math.min(end1, end2);
//                        ans.add({start,end});
//                    }
//                }
//                else
//                {
//                    if(start1 <= end2)
//                    {
//                        int start = Math.max(start1, start2);
//                        int end = Math.min(end1, end2);
//                        ans.add({start,end});
//                    }
//                }
//                if(end1 < end2)
//                {
//                    i++;
//                }
//                else
//                {
//                    j++;
//                }
//            }
//            return ans;
//        }
//    }
//}
