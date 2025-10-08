class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    // Step 1: Create a HashMap to store frequency of elements in nums1
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums1) {  // iterate nums1
        // Increment count if element already exists, else put 1
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    // Step 2: First, we need to know intersection size
    int count = 0;  // to track number of elements in intersection
    for (int num : nums2) {  // iterate nums2
        if (map.containsKey(num)) {  // check if element exists in nums1
            count++;  // increment count
            map.put(num, map.get(num) - 1);  // decrement frequency
            if (map.get(num) == 0) {  // remove if frequency becomes 0
                map.remove(num);
            }
        }
    }

    // Step 3: Create an array of exact size (count) to store intersection
    int[] result = new int[count];  // fixed-size array
    int index = 0;

    // Step 4: Reset the HashMap because we already modified it
    // Or alternatively, build it again from nums1
    map.clear();
    for (int num : nums1) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    // Step 5: Fill the result array
    for (int num : nums2) {
        if (map.containsKey(num)) {
            result[index++] = num;  // put element in array
            map.put(num, map.get(num) - 1);
            if (map.get(num) == 0) {
                map.remove(num);
            }
        }
    }

    return result;  // return fixed-size array
}

}