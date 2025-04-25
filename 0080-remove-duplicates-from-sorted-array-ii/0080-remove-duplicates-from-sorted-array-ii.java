class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int ele:nums)
        {
            hmap.put(ele,hmap.getOrDefault(ele,0)+1);
        }
        int i=0;
        for(Map.Entry<Integer,Integer> entry:hmap.entrySet())
        {
            if(entry.getValue()>=2)
            {
                nums[i]=entry.getKey();
                nums[i+1]=entry.getKey();
                i=i+2;
            
            }
            if(entry.getValue()==1)
            {
                nums[i]=entry.getKey();
                i++;
            }
        }
        Arrays.sort(nums,0,i);
        return i;

    }
}