class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        long ans=1;
        int l=0;
        for(int r=1;r<nums.length;r++)
        {
            ans++;
            if(nums[r]!=nums[r-1])
            {
                ans+=(r-l);
            }
            else
            {
                l=r;
            }
        }
        return ans;
    }
}