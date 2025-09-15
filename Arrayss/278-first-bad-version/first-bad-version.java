/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       // this will make you time limit exceed  11/24 tc runned
        // for(int i=1;i<=n;i++){
        //     boolean value = isBadVersion(i);

        //     if(value== true ){
        //         return i;
        //     }
        // }
        // return -1;

        int start =0,end=n-1;

        while(start<=end){

            int randomeno = start + (end-start)/2;
            boolean value = isBadVersion(randomeno);
            if(start==end){
                if(value==false){
                    return randomeno+1;
                }
                else{
                    return randomeno;
                }
            }
            if(value == true ){
                end = randomeno;
            }
            else if(value ==false){
                start = randomeno+1;
            }
            
        }
        
        return -1;

    }
}