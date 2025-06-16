class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[j]-nums[i]>max)&& i<j)
                    max=Math.max(nums[j]-nums[i],max);
            }
        }
        if(max==0)
            return -1;
        return max;        
    }
}