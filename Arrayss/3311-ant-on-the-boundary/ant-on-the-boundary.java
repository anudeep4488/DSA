class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int bound=0;
        int count=nums[0];
        for(int i=1;i<nums.length;i++){
            count+=nums[i];
            if(count==0){
                bound++;
            }
            
        }
        return bound;
    }
}