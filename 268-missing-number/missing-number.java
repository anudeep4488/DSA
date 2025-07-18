class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sumOfNaturial= n*(n+1)/2;
        int add=0;
        for( int num:nums){
            add+=num;

        }
        return sumOfNaturial - add;
          
    }
}