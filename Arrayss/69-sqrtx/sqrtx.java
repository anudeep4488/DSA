class Solution {
    public int mySqrt(int x) {

        int start=0,end=x;
        while(start<=end){
            int mid = start +(end-start)/2;
            long value= (long)mid*mid;

            if(value== x){
                return mid;
            }
            if (value>x){
                end=mid-1;
            }else{
            start=mid+1;
            }
            //when tis terminate it means start>end it will terminate it mean we get lowest square root number for non perfect room number
        }     
        return end;   // whhen it terminate from loop it will get here end gives you low perfect asr value
     
    }
}