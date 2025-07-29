import java.util.*;
class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted= Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);

        int count =0;
       
         for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) {
                count++;  // If position is wrong, increase count
            }
        }
        return count;
    }
}