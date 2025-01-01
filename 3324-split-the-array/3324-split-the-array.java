class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        for(int val:hmap.values())
        {
            if(val>2)
                return false;
        }
        return true;        
    }
}