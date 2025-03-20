class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> hset=new HashSet();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if((nums1[i]^nums2[j])==0)
                {
                    hset.add(nums2[j]);
                }
            }
        }
        int n=0;
        if(nums1.length>nums2.length)
        {
            n=nums1.length;
        }
        else
        {
            n=nums2.length;
        }
        int[] arr=new int[hset.size()];
        int i=0;
        for(int ele:hset)
        {
            arr[i]=ele;
            i++;
        }
        return arr;
    }
}