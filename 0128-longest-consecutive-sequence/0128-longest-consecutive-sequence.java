class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        HashSet<Integer> hset=new HashSet<>();
        for(int ele:nums)
        {
            hset.add(ele);
        }
        int max=0;
        for(int ele:hset)
        {
            if(!hset.contains(ele-1))
            {
                int current=ele;
                int count=1;
                while(hset.contains(current+1))
                {
                    current=current+1;
                    count++;
                }
                max=Math.max(max,count);
                count=1;
            }
           

        }
        return max;
    }
}