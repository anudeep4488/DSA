class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0,j=0;
        int element =Integer.MIN_VALUE ; // used to store the previos insersection number from both arrrays
        List<Integer> list = new ArrayList<>(); // we createdd dynamic list bcz i dont knew size of common elements in the give arrs 
        while(i<nums1.length && j<nums2.length){

            if(nums1[i]==nums2[j]){ // if both equal it gets into this loop
               
                if(nums1[i] != element) {// mundhu store ina element present equal elemnts same kakapoty ney store kaa ]
                list.add(nums1[i]);// store inaaka
                element =nums1[i]; // element la update ka  inn next interation lo compar=re chesovadaniki to ovaide duplictes interected value
                }
                i++;
                j++;

                
            }
            else if(nums1[i]<nums2[j]) 
                { 
                i++;
            }
            else{
                j++;
            }
                   
        }
        int[] result = new int[list.size()];
        for(int k=0;k<result.length;k++){
            result[k]=list.get(k);
        }
        return result;
    }
}