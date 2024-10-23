class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        Set<List<Integer>> hset=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        int target=0;
        for(int i=0;i<n-1;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target)
                {
                    hset.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum<target)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        arr.addAll(hset);
        return arr;
    }
}