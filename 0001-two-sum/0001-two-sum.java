class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int n=nums.length;
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int comp=target-nums[i];
            if (hmap.containsKey(comp)) 
            {
                return new int[] { hmap.get(comp), i}; 
            }           
            hmap.put(nums[i],i);
        }      
        return new int[]{};
    }
}