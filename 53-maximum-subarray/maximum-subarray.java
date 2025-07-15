class Solution {
    public int maxSubArray(int[] nums) {

        int curSum=0; // 0+5=5 it alwaway updated by adding  if it goes to negative values it makes to 0 because that makes decrease the max value further
        int maxSum=nums[0]; //initially take from iat index becoz to compare to get max by currsum

        for(int i=0;i<nums.length;i++){  //  step1 -> i=5
            if(curSum<0){  //step2 -> false
                curSum=0;
            }
            curSum+=nums[i];   // step 3 -> 5 added to cursum
            maxSum=Math.max(curSum,maxSum); //step4-> 5,5 maxSum=5

        }
        return maxSum;
    }
}