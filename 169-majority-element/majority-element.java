class Solution {
    public int majorityElement(int[] nums) {
        
        int size=(nums.length)/2;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>size){
                    return nums[i];
                }
        }
        return -1;
        
    }
    
}