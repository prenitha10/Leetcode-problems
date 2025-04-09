class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> hset=new HashSet<>();
        for(int i=nums.length-1;i>=0;i--)
        {
            if(hset.contains(nums[i]))
            {
                return i/3+1;
            }
            hset.add(nums[i]);
        }
        return 0;
    }
}