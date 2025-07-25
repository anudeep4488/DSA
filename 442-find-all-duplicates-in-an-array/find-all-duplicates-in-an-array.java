import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // go to index = number - 1

            if (nums[index] < 0) {
                // Already visited → duplicate
                result.add(Math.abs(nums[i]));
            } else {
                // Mark as visited
                nums[index] = -nums[index];
            }
        }

        return result;
    }
}
