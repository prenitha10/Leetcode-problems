class Solution {
    public int maxSubArray(int[] nums) {
        int current=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            current+=nums[i];
            if(current>max)
                max=current;
            if(current<0)
                current=0;
        }
        return max;        
    }
}