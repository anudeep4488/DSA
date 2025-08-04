class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n=nums.length;
        int j=nums.length-1;
        long conc =0;

        if(n%2!=0){
            conc+=nums[n/2];
        }
        for(int i=0;i<n/2;i++){
            int start=i;
            int end=j-i;
            //here convered into string and concatinated
            String combined = String.valueOf(nums[start]) + String.valueOf(nums[end]);
            //after concatinating convert into integer to add for next itirated number
            long value = Long.parseLong(combined);
            conc+=value;
            
        }
        return conc;
        
        
    }
}