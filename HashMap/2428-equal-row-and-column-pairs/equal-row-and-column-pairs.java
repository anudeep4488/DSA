import java.util.*;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;

        // Map to store frequency of each row represented as a List of Integers
        Map<List<Integer>, Integer> rowMap = new HashMap<>();

        // Store all rows in the map
        for (int i = 0; i < n; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                rowList.add(grid[i][j]);  // Add each element of the row to list
            }
            rowMap.put(rowList, rowMap.getOrDefault(rowList, 0) + 1);  // Count frequency
        }

        int count = 0;  // Final count of matching pairs

        // Compare each column with stored rows 
        for (int j = 0; j < n; j++) {
            List<Integer> colList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                colList.add(grid[i][j]);  // Create column as a list
            }

            // If this column exists in rowMap, add its frequency to count
            count += rowMap.getOrDefault(colList, 0);
        }

        return count;
    }
}
