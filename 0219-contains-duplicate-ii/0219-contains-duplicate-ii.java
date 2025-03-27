class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hset=new HashSet<>();
        for(int r=0;r<nums.length;r++)
        {
            if(hset.contains(nums[r]) && hset.size()<=k )
            {
                return true;
            }
            if(r>=k)
            {
                hset.remove(nums[r-k]);
            }
            hset.add(nums[r]);        
        }
        return false;
    }
}