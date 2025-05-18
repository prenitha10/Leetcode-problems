class Solution {
    public String largestNumber(int[] nums) {
        int sum=-1;
        for(int ele:nums)
        {
            sum+=ele;
        }
        if(sum==-1)
            return "0";
        String [] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(arr,(a,b)->(a+b).compareTo(b+a));
        
        StringBuilder sb=new StringBuilder();
        for(int i=nums.length-1;i>=0;i--)
        {
            sb.append(arr[i]);
        }
        return String.valueOf(sb);
    }
}