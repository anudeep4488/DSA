class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n=nums.length; 
        int j=nums.length-1;
        long concatinated =0;

        if(n%2!=0){ // if it is odd add directly mid or extra element to the concatinated varoable
            concatinated +=nums[n/2];//if there is even length it wont get intom this loop
        }
        for(int i=0;i<n/2;i++){ //it will iterate less than mid 
            int start=i;
            int end=j-i;
            //here convered into string and concatinated
            String combined = String.valueOf(nums[start]) + String.valueOf(nums[end]);
            //after concatinating convert into integer to add for next itirated number
            long value = Long.parseLong(combined);
            concatinated +=value;
            
        }
        return concatinated;
        
        
    }
}