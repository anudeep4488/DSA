/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        // this linar cod ewe make time limit exceeede  so consider constarains and go on

        // for(int i=0;i<=n;i++){
        //     int value=guess(i);
        //     if(value==0)return i;
        // }
        // return 0;

        // he is saying that pick random number  and sen it from guss mentod so it will tell you that wether it is greater or smaller

        int start =0,end=n;
        
        while(start<=end){
            int mid=start +(end-start)/2;
            int value=guess(mid); // you choose randm number using binary search and you passs it to guess mehos that we return wether it it higher(-1)or lowe(1) you choosed based on that we have to adle here in order to give good gusses numbers by using binary seerach radher that linear search
            if(value==0){
                return mid;
            }
            else if(value==-1){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return 0;

        // we computre it in (log n) from o(n)
        // our main idea is to make system to execute faster in less timw by considering constarins
    }
}