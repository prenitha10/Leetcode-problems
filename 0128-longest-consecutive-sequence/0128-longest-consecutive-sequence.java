class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int max=0;
        int sum=1;
        for(int r=0;r<nums.length-1;r++)
        {
            if(nums[r+1]==nums[r])
                continue;
            if(nums[r+1]==nums[r]+1)
            {
                sum++;
            }
            else
            {
                max=Math.max(max,sum);
                sum=1;
            }

        }
        return Math.max(max,sum);
    }
}