class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
            }
        }
        int maxVal=0;
        int maxKey=0;
        ArrayList<Integer> arr=new ArrayList<>(hmap.keySet());
        Collections.sort(arr,Collections.reverseOrder());
        for(int ele:arr)
        {
            int val=hmap.get(ele);
            if(val>=maxVal)
            {
                maxVal=val;
                maxKey=ele;
            }
        }
        if(maxVal==0) return -1;
            return maxKey;
    }
}