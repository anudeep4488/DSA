class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        //using 2 pointers
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
             else if(nums1[i]>nums2[j]){
                j++;

             }
            else{
                return nums1[i];
            }
        }
       return -1; 
    }
}