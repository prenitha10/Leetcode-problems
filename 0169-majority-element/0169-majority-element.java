class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int ele:nums)
        {
            hmap.put(ele,hmap.getOrDefault(ele,0)+1);
        }
        int n=nums.length;
        n=n/2;
        for(Map.Entry<Integer,Integer> entry:hmap.entrySet())
        {
            if(entry.getValue()>n)
                return entry.getKey();
        }
        return 0;
    }
}