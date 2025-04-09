class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> hset=new HashSet<>();
        int count=0;
        for(int ele:nums)
            hset.add(ele);
        for(int ele:hset)
        {
            if(ele>k)
                count++;
            else if(ele==k)
                continue;
            else
                return -1;
        }
        return count;
    }
}