class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int key=target-nums[i];
            if(hmap.containsKey(key))
            {
                return new int[]{hmap.get(key),i};
            }
            hmap.put(nums[i],i);
        }
        return new int[]{};
    }
}