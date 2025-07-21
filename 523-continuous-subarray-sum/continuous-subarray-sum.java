class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1); // for case where sum from beginning is divisible by k
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        int rem = k != 0 ? sum % k : sum; // handle k = 0

        if (map.containsKey(rem)) {
            if (i - map.get(rem) >= 2) {
                return true;
            }
        } else {
            map.put(rem, i);
        }
    }

    return false;
    }
}