class Solution {
    public int findMinMoves(int[] machines) {
        int sum=0;
        for(int i:machines)
        {
            sum+=i;
        }
        int n=machines.length;
        if(sum%n!=0)
            return -1;
        int val=sum/n;
        int max=0;
        int c=0;
        for(int num:machines)
        {
            c+=num-val;
            max=Math.max(Math.max(max,Math.abs(c)),num-val);
        }
        return max;
    }
}