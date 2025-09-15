class Solution {
    public int arrangeCoins(int n) {
        int start=0,end=n;

        while(start<=end){

            int mid=start+(end-start)/2;
            long requiredToFill =(long)mid*(mid+1)/2;

            if(requiredToFill==n){
                return mid;
            }
            else if(requiredToFill>n){
                end =mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return end;
        
    }
}