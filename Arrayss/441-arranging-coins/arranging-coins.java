class Solution {
    public int arrangeCoins(int n) {
        int start=0,end=n;// defined start and end

        while(start<=end){ // if definatly terminate start>end

            int mid=start+(end-start)/2;// find random number that number we are considerong as stairs which become n number we consider it as mic and find sum of natural number till that   number then we get how many conins retured that stair to fill it completly
            long requiredToFill =(long)mid*(mid+1)/2;// calculate coins reuired  till that stair

            if(requiredToFill==n){ //are specific stair is completly filled by givne number
                return mid;
            }
            else if(requiredToFill>n){
                end =mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return end; // we are retung end because it get at last completly filled stair and it terminate there it self (it make fli over there)
        
    }
}