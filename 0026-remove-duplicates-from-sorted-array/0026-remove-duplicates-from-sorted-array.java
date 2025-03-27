class Solution {
    public int removeDuplicates(int[] nums) 
    {
        HashSet<Integer> hset=new HashSet<>();
        for(int ele:nums)
        {
            hset.add(ele);
        }
        int i=0;
        for(int ele:hset)
        {
            nums[i]=ele;
            i++;
        }
        Arrays.sort(nums,0,hset.size());
        return hset.size();      
        
    }
}