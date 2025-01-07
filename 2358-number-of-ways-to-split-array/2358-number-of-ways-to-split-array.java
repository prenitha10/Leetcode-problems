class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        int count = 0;
        long sum1 = 0, sum2 = 0;
        for(int j = 1; j < n; j++){
            sum2 += nums[j];
        }
        for(int i = 0; i < n-1; i++){
            sum1 += nums[i];
            if(sum1 >= sum2){
                count++;
            }
            sum2 -= nums[i+1];
        }
        return count;
    }
}