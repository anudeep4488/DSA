import java.util.*;  // To use HashMap, List, Collections

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        // Step 1: Count how many times each number appears
        // Example: if arr = [4,3,1,1,3,3,2], then freq = {4=1, 3=3, 1=2, 2=1}
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            // If number not in map, add with 1. If already there, increase count by 1.
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Store all the frequencies in a list
        // We only care about how many times values appear, not which number it is.
        List<Integer> freqList = new ArrayList<>(freq.values());

        // Step 3: Sort the list of frequencies in increasing order
        // So we can remove smallest groups first
        Collections.sort(freqList);
        // Example: [1, 1, 2, 3] — means we remove the 1’s first (easiest to remove)

        // Step 4: Start with all unique numbers
        int uniqueCount = freqList.size(); // How many different numbers we have

        // Step 5: Try removing the smallest frequency groups using k
        for (int count : freqList) {
            if (k >= count) {
                // We can remove this entire group
                k -= count;       // Reduce the number of removals left
                uniqueCount--;    // One unique number is now fully removed
            } else {
                // We can’t remove this group fully, so we stop here
                break;
            }
        }

        // Step 6: Return the number of unique numbers left
        return uniqueCount;
    }
}
