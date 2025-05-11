class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> hash = new HashMap<>();
       for(int i=0; i<nums.length; i++){
            int res = target - nums[i];
            if(hash.containsKey(res)){
                return new int[] {hash.get(res),i};
            }
            else{
                hash.put(nums[i],i);
            }    
        }
        throw new IllegalArgumentException("Not match");
    }
}