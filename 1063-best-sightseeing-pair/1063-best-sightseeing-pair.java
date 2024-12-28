class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=0;
        int PrevVal=values[0];
        int n=values.length;
        for(int i=1;i<n;i++)
        {   
            max=Math.max(max,PrevVal+values[i]-i);
            PrevVal=Math.max(PrevVal,values[i]+i);
        }  
        return max;      
    }
}