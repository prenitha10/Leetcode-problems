class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int current=1;
        for(int i=0;i<nums.length;i++)
        {
            current*=nums[i];
            max=Math.max(max,current);
            if(nums[i]==0) 
            {
                current=1;
            }
        }
        current=1;
        for(int i=nums.length-1;i>0;i--)
        {
            current*=nums[i];
            max=Math.max(max,current);
            if(nums[i]==0) 
            {
                current=1;
            }
        }
        return max;
    }
}