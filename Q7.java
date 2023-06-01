class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flagI=false,flagD=false;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                flagI=true;
            }
            else if(nums[i]>nums[i+1])
            {
                flagD = true;
            }
        }
        return flagI&&flagD?false:true;
    }
}
