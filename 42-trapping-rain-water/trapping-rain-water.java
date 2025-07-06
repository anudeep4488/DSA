class Solution {
    public int trap(int[] height) {
        int n =height.length;
        //create leftmax boundary -Auxiliary Array
        int LeftMax[] = new int[n];
        LeftMax[0]=height[0];
        for(int i =1;i<n;i++)
        {
            LeftMax[i]=Math.max(height[i],LeftMax[i-1]);
        }
        //create rightmax boundary -Auxiliary Array
        int RightMax[] = new int[n];
        RightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            RightMax[i]=Math.max(height[i],RightMax[i+1]);
        }
        //loop
        int TrappedWater =0;
        for(int i=0;i<n;i++)
        {   //waterlevel
           int WaterLevel =Math.min(LeftMax[i],RightMax[i]);
            //trappedWater 
           TrappedWater += WaterLevel -height[i];
        }
        return TrappedWater;         
    }
  
}