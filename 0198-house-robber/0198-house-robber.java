class Solution {
    public int rob(int[] nums) {
        int prev=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            int temp=Math.max(max,prev+nums[i]);
            prev=max;
            max=temp;
        }
        return max;
    }
}